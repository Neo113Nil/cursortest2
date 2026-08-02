package com.microsoft.codepush.react;

import android.content.Context;
import android.util.Base64;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jwt.SignedJWT;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.DigestInputStream;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class CodePushUpdateUtils {
    public static final String NEW_LINE = System.getProperty("line.separator");

    public static boolean isHashIgnored(String str) {
        return str.startsWith("__MACOSX/") || str.equals(".DS_Store") || str.endsWith("/.DS_Store") || str.equals(CodePushConstants.BUNDLE_JWT_FILE) || str.endsWith("/.codepushrelease");
    }

    private static void addContentsOfFolderToManifest(String str, String str2, ArrayList<String> arrayList) {
        for (File file : new File(str).listFiles()) {
            String name = file.getName();
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(str2.isEmpty() ? "" : str2 + "/");
            sb.append(name);
            String sb2 = sb.toString();
            if (!isHashIgnored(sb2)) {
                if (file.isDirectory()) {
                    addContentsOfFolderToManifest(absolutePath, sb2, arrayList);
                } else {
                    try {
                        arrayList.add(sb2 + ":" + computeHash(new FileInputStream(file)));
                    } catch (FileNotFoundException e) {
                        throw new CodePushUnknownException("Unable to compute hash of update contents.", e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0022, code lost:
    
        r5.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[Catch: IOException -> 0x0056, TRY_LEAVE, TryCatch #1 {IOException -> 0x0056, blocks: (B:37:0x0052, B:30:0x005a), top: B:36:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String computeHash(InputStream inputStream) {
        Throwable th;
        Throwable e;
        DigestInputStream digestInputStream = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                DigestInputStream digestInputStream2 = new DigestInputStream(inputStream, messageDigest);
                try {
                    do {
                    } while (digestInputStream2.read(new byte[8192]) != -1);
                    digestInputStream2.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return String.format("%064x", new BigInteger(1, messageDigest.digest()));
                } catch (IOException e2) {
                    e = e2;
                    throw new CodePushUnknownException("Unable to compute hash of update contents.", e);
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    throw new CodePushUnknownException("Unable to compute hash of update contents.", e);
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        digestInputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        throw th;
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            e = e;
            throw new CodePushUnknownException("Unable to compute hash of update contents.", e);
        } catch (NoSuchAlgorithmException e6) {
            e = e6;
            e = e;
            throw new CodePushUnknownException("Unable to compute hash of update contents.", e);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
            }
            if (inputStream != null) {
            }
            throw th;
        }
    }

    public static void copyNecessaryFilesFromCurrentPackage(String str, String str2, String str3) throws IOException {
        if (str2 == null || !new File(str2).exists()) {
            CodePushUtils.log("Unable to copy files from current package during diff update, because currentPackageFolderPath is invalid.");
            return;
        }
        FileUtils.copyDirectoryContents(str2, str3);
        try {
            JSONArray jSONArray = CodePushUtils.getJsonObjectFromFile(str).getJSONArray("deletedFiles");
            for (int i = 0; i < jSONArray.length(); i++) {
                File file = new File(str3, jSONArray.getString(i));
                if (file.exists()) {
                    file.delete();
                }
            }
        } catch (JSONException e) {
            throw new CodePushUnknownException("Unable to copy files from current package during diff update", e);
        }
    }

    public static String findJSBundleInUpdateContents(String str, String str2) {
        for (File file : new File(str).listFiles()) {
            String appendPathComponent = CodePushUtils.appendPathComponent(str, file.getName());
            if (file.isDirectory()) {
                String findJSBundleInUpdateContents = findJSBundleInUpdateContents(appendPathComponent, str2);
                if (findJSBundleInUpdateContents != null) {
                    return CodePushUtils.appendPathComponent(file.getName(), findJSBundleInUpdateContents);
                }
            } else {
                String name = file.getName();
                if (name.equals(str2)) {
                    return name;
                }
            }
        }
        return null;
    }

    public static String getHashForBinaryContents(Context context, boolean z) {
        try {
            try {
                return CodePushUtils.getStringFromInputStream(context.getAssets().open(CodePushConstants.CODE_PUSH_HASH_FILE_NAME));
            } catch (IOException unused) {
                return CodePushUtils.getStringFromInputStream(context.getAssets().open(CodePushConstants.CODE_PUSH_OLD_HASH_FILE_NAME));
            }
        } catch (IOException unused2) {
            if (z) {
                return null;
            }
            CodePushUtils.log("Unable to get the hash of the binary's bundled resources - \"codepush.gradle\" may have not been added to the build definition.");
            return null;
        }
    }

    public static void verifyFolderHash(String str, String str2) {
        CodePushUtils.log("Verifying hash for folder path: " + str);
        ArrayList arrayList = new ArrayList();
        addContentsOfFolderToManifest(str, "", arrayList);
        Collections.sort(arrayList);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        String replace = jSONArray.toString().replace("\\/", "/");
        CodePushUtils.log("Manifest string: " + replace);
        String computeHash = computeHash(new ByteArrayInputStream(replace.getBytes()));
        CodePushUtils.log("Expected hash: " + str2 + ", actual hash: " + computeHash);
        if (!str2.equals(computeHash)) {
            throw new CodePushInvalidUpdateException("The update contents failed the data integrity check.");
        }
        CodePushUtils.log("The update contents succeeded the data integrity check.");
    }

    public static Map<String, Object> verifyAndDecodeJWT(String str, PublicKey publicKey) {
        try {
            SignedJWT parse = SignedJWT.parse(str);
            if (!parse.verify(new RSASSAVerifier((RSAPublicKey) publicKey))) {
                return null;
            }
            Map<String, Object> claims = parse.getJWTClaimsSet().getClaims();
            CodePushUtils.log("JWT verification succeeded, payload content: " + claims.toString());
            return claims;
        } catch (Exception e) {
            CodePushUtils.log(e.getMessage());
            CodePushUtils.log(e.getStackTrace().toString());
            return null;
        }
    }

    public static PublicKey parsePublicKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replace(NEW_LINE, "").getBytes(), 0)));
        } catch (Exception e) {
            CodePushUtils.log(e.getMessage());
            CodePushUtils.log(e.getStackTrace().toString());
            return null;
        }
    }

    public static String getSignatureFilePath(String str) {
        return CodePushUtils.appendPathComponent(CodePushUtils.appendPathComponent(str, "CodePush"), CodePushConstants.BUNDLE_JWT_FILE);
    }

    public static String getSignature(String str) {
        try {
            return FileUtils.readFileToString(getSignatureFilePath(str));
        } catch (IOException e) {
            CodePushUtils.log(e.getMessage());
            CodePushUtils.log(e.getStackTrace().toString());
            return null;
        }
    }

    public static void verifyUpdateSignature(String str, String str2, String str3) throws CodePushInvalidUpdateException {
        CodePushUtils.log("Verifying signature for folder path: " + str);
        PublicKey parsePublicKey = parsePublicKey(str3);
        if (parsePublicKey == null) {
            throw new CodePushInvalidUpdateException("The update could not be verified because no public key was found.");
        }
        String signature = getSignature(str);
        if (signature == null) {
            throw new CodePushInvalidUpdateException("The update could not be verified because no signature was found.");
        }
        Map<String, Object> verifyAndDecodeJWT = verifyAndDecodeJWT(signature, parsePublicKey);
        if (verifyAndDecodeJWT == null) {
            throw new CodePushInvalidUpdateException("The update could not be verified because it was not signed by a trusted party.");
        }
        String str4 = (String) verifyAndDecodeJWT.get("contentHash");
        if (str4 == null) {
            throw new CodePushInvalidUpdateException("The update could not be verified because the signature did not specify a content hash.");
        }
        if (!str4.equals(str2)) {
            throw new CodePushInvalidUpdateException("The update contents failed the code signing check.");
        }
        CodePushUtils.log("The update contents succeeded the code signing check.");
    }
}
