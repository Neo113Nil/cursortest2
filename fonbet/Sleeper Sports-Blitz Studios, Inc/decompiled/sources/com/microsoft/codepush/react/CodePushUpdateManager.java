package com.microsoft.codepush.react;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.net.HttpHeaders;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class CodePushUpdateManager {
    private String mDocumentsDirectory;

    public CodePushUpdateManager(String str) {
        this.mDocumentsDirectory = str;
    }

    private String getDownloadFilePath() {
        return CodePushUtils.appendPathComponent(getCodePushPath(), CodePushConstants.DOWNLOAD_FILE_NAME);
    }

    private String getUnzippedFolderPath() {
        return CodePushUtils.appendPathComponent(getCodePushPath(), CodePushConstants.UNZIPPED_FOLDER_NAME);
    }

    private String getDocumentsDirectory() {
        return this.mDocumentsDirectory;
    }

    private String getCodePushPath() {
        String appendPathComponent = CodePushUtils.appendPathComponent(getDocumentsDirectory(), "CodePush");
        return CodePush.isUsingTestConfiguration() ? CodePushUtils.appendPathComponent(appendPathComponent, "TestPackages") : appendPathComponent;
    }

    private String getStatusFilePath() {
        return CodePushUtils.appendPathComponent(getCodePushPath(), CodePushConstants.STATUS_FILE);
    }

    public JSONObject getCurrentPackageInfo() {
        String statusFilePath = getStatusFilePath();
        if (!FileUtils.fileAtPathExists(statusFilePath)) {
            return new JSONObject();
        }
        try {
            return CodePushUtils.getJsonObjectFromFile(statusFilePath);
        } catch (IOException e) {
            throw new CodePushUnknownException("Error getting current package info", e);
        }
    }

    public void updateCurrentPackageInfo(JSONObject jSONObject) {
        try {
            CodePushUtils.writeJsonToFile(jSONObject, getStatusFilePath());
        } catch (IOException e) {
            throw new CodePushUnknownException("Error updating current package info", e);
        }
    }

    public String getCurrentPackageFolderPath() {
        String optString = getCurrentPackageInfo().optString(CodePushConstants.CURRENT_PACKAGE_KEY, null);
        if (optString == null) {
            return null;
        }
        return getPackageFolderPath(optString);
    }

    public String getCurrentPackageBundlePath(String str) {
        JSONObject currentPackage;
        String currentPackageFolderPath = getCurrentPackageFolderPath();
        if (currentPackageFolderPath == null || (currentPackage = getCurrentPackage()) == null) {
            return null;
        }
        String optString = currentPackage.optString(CodePushConstants.RELATIVE_BUNDLE_PATH_KEY, null);
        if (optString == null) {
            return CodePushUtils.appendPathComponent(currentPackageFolderPath, str);
        }
        return CodePushUtils.appendPathComponent(currentPackageFolderPath, optString);
    }

    public String getPackageFolderPath(String str) {
        return CodePushUtils.appendPathComponent(getCodePushPath(), str);
    }

    public String getCurrentPackageHash() {
        return getCurrentPackageInfo().optString(CodePushConstants.CURRENT_PACKAGE_KEY, null);
    }

    public String getPreviousPackageHash() {
        return getCurrentPackageInfo().optString(CodePushConstants.PREVIOUS_PACKAGE_KEY, null);
    }

    public JSONObject getCurrentPackage() {
        String currentPackageHash = getCurrentPackageHash();
        if (currentPackageHash == null) {
            return null;
        }
        return getPackage(currentPackageHash);
    }

    public JSONObject getPreviousPackage() {
        String previousPackageHash = getPreviousPackageHash();
        if (previousPackageHash == null) {
            return null;
        }
        return getPackage(previousPackageHash);
    }

    public JSONObject getPackage(String str) {
        try {
            return CodePushUtils.getJsonObjectFromFile(CodePushUtils.appendPathComponent(getPackageFolderPath(str), CodePushConstants.PACKAGE_FILE_NAME));
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0238 A[Catch: IOException -> 0x0234, TryCatch #1 {IOException -> 0x0234, blocks: (B:52:0x0230, B:39:0x0238, B:41:0x023d, B:43:0x0242), top: B:51:0x0230 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023d A[Catch: IOException -> 0x0234, TryCatch #1 {IOException -> 0x0234, blocks: (B:52:0x0230, B:39:0x0238, B:41:0x023d, B:43:0x0242), top: B:51:0x0230 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0242 A[Catch: IOException -> 0x0234, TRY_LEAVE, TryCatch #1 {IOException -> 0x0234, blocks: (B:52:0x0230, B:39:0x0238, B:41:0x023d, B:43:0x0242), top: B:51:0x0230 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void downloadPackage(JSONObject jSONObject, String str, DownloadProgressCallback downloadProgressCallback, String str2) throws IOException {
        String str3;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        HttpURLConnection httpURLConnection;
        String str4;
        HttpURLConnection httpURLConnection2;
        BufferedOutputStream bufferedOutputStream2;
        String str5;
        String str6;
        String str7 = "Error closing IO resources.";
        String optString = jSONObject.optString("packageHash", null);
        String packageFolderPath = getPackageFolderPath(optString);
        String appendPathComponent = CodePushUtils.appendPathComponent(packageFolderPath, CodePushConstants.PACKAGE_FILE_NAME);
        if (FileUtils.fileAtPathExists(packageFolderPath)) {
            FileUtils.deleteDirectoryAtPath(packageFolderPath);
        }
        String optString2 = jSONObject.optString(CodePushConstants.DOWNLOAD_URL_KEY, null);
        try {
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(optString2).openConnection();
            try {
                httpURLConnection3.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
                bufferedInputStream = new BufferedInputStream(httpURLConnection3.getInputStream());
            } catch (MalformedURLException e) {
                e = e;
                str3 = "Error closing IO resources.";
                str4 = optString2;
                httpURLConnection2 = httpURLConnection3;
                bufferedInputStream = null;
                bufferedOutputStream2 = null;
                fileOutputStream = null;
                try {
                    throw new CodePushMalformedDataException(str4, e);
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnection2;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e2) {
                            throw new CodePushUnknownException(str3, e2);
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                str3 = "Error closing IO resources.";
                httpURLConnection = httpURLConnection3;
                bufferedOutputStream = null;
                bufferedInputStream = null;
            }
            try {
                long contentLength = httpURLConnection3.getContentLength();
                File file = new File(getCodePushPath());
                file.mkdirs();
                File file2 = new File(file, CodePushConstants.DOWNLOAD_FILE_NAME);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream2, 262144);
                    fileOutputStream = fileOutputStream2;
                    try {
                        byte[] bArr = new byte[262144];
                        httpURLConnection = httpURLConnection3;
                        try {
                            byte[] bArr2 = new byte[4];
                            long j = 0;
                            while (true) {
                                str5 = str7;
                                str4 = optString2;
                                try {
                                    try {
                                        int read = bufferedInputStream.read(bArr, 0, 262144);
                                        if (read < 0) {
                                            break;
                                        }
                                        if (j < 4) {
                                            int i = 0;
                                            while (i < read) {
                                                int i2 = ((int) j) + i;
                                                int i3 = i;
                                                if (i2 >= 4) {
                                                    break;
                                                }
                                                try {
                                                    bArr2[i2] = bArr[i3];
                                                    i = i3 + 1;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    bufferedOutputStream = bufferedOutputStream2;
                                                    str3 = str5;
                                                    if (bufferedOutputStream != null) {
                                                    }
                                                    if (fileOutputStream != null) {
                                                    }
                                                    if (bufferedInputStream != null) {
                                                    }
                                                    if (httpURLConnection != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        }
                                        j += read;
                                        bufferedOutputStream2.write(bArr, 0, read);
                                        downloadProgressCallback.call(new DownloadProgress(contentLength, j));
                                        str7 = str5;
                                        optString2 = str4;
                                    } catch (MalformedURLException e3) {
                                        e = e3;
                                        str3 = str5;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    str3 = str5;
                                }
                            }
                            if (contentLength != j) {
                                str3 = str5;
                                try {
                                    throw new CodePushUnknownException("Received " + j + " bytes, expected " + contentLength);
                                } catch (MalformedURLException e4) {
                                    e = e4;
                                    httpURLConnection2 = httpURLConnection;
                                    throw new CodePushMalformedDataException(str4, e);
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    if (bufferedOutputStream != null) {
                                    }
                                    if (fileOutputStream != null) {
                                    }
                                    if (bufferedInputStream != null) {
                                    }
                                    if (httpURLConnection != null) {
                                    }
                                    throw th;
                                }
                            }
                            boolean z = ByteBuffer.wrap(bArr2).getInt() == 1347093252;
                            try {
                                bufferedOutputStream2.close();
                                fileOutputStream.close();
                                bufferedInputStream.close();
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (z) {
                                    String unzippedFolderPath = getUnzippedFolderPath();
                                    FileUtils.unzipFile(file2, unzippedFolderPath);
                                    FileUtils.deleteFileOrFolderSilently(file2);
                                    String appendPathComponent2 = CodePushUtils.appendPathComponent(unzippedFolderPath, CodePushConstants.DIFF_MANIFEST_FILE_NAME);
                                    boolean fileAtPathExists = FileUtils.fileAtPathExists(appendPathComponent2);
                                    if (fileAtPathExists) {
                                        str6 = packageFolderPath;
                                        CodePushUpdateUtils.copyNecessaryFilesFromCurrentPackage(appendPathComponent2, getCurrentPackageFolderPath(), str6);
                                        new File(appendPathComponent2).delete();
                                    } else {
                                        str6 = packageFolderPath;
                                    }
                                    FileUtils.copyDirectoryContents(unzippedFolderPath, str6);
                                    FileUtils.deleteFileAtPathSilently(unzippedFolderPath);
                                    String findJSBundleInUpdateContents = CodePushUpdateUtils.findJSBundleInUpdateContents(str6, str);
                                    if (findJSBundleInUpdateContents == null) {
                                        throw new CodePushInvalidUpdateException("Update is invalid - A JS bundle file named \"" + str + "\" could not be found within the downloaded contents. Please check that you are releasing your CodePush updates using the exact same JS bundle file name that was shipped with your app's binary.");
                                    }
                                    if (FileUtils.fileAtPathExists(appendPathComponent)) {
                                        new File(appendPathComponent).delete();
                                    }
                                    if (fileAtPathExists) {
                                        CodePushUtils.log("Applying diff update.");
                                    } else {
                                        CodePushUtils.log("Applying full update.");
                                    }
                                    boolean z2 = str2 != null;
                                    boolean fileAtPathExists2 = FileUtils.fileAtPathExists(CodePushUpdateUtils.getSignatureFilePath(str6));
                                    if (z2) {
                                        if (fileAtPathExists2) {
                                            CodePushUpdateUtils.verifyFolderHash(str6, optString);
                                            CodePushUpdateUtils.verifyUpdateSignature(str6, optString, str2);
                                        } else {
                                            throw new CodePushInvalidUpdateException("Error! Public key was provided but there is no JWT signature within app bundle to verify. Possible reasons, why that might happen: \n1. You've been released CodePush bundle update using version of CodePush CLI that is not support code signing.\n2. You've been released CodePush bundle update without providing --privateKeyPath option.");
                                        }
                                    } else if (fileAtPathExists2) {
                                        CodePushUtils.log("Warning! JWT signature exists in codepush update but code integrity check couldn't be performed because there is no public key configured. Please ensure that public key is properly configured within your application.");
                                        CodePushUpdateUtils.verifyFolderHash(str6, optString);
                                    } else if (fileAtPathExists) {
                                        CodePushUpdateUtils.verifyFolderHash(str6, optString);
                                    }
                                    CodePushUtils.setJSONValueForKey(jSONObject, CodePushConstants.RELATIVE_BUNDLE_PATH_KEY, findJSBundleInUpdateContents);
                                } else {
                                    FileUtils.moveFile(file2, packageFolderPath, str);
                                }
                                CodePushUtils.writeJsonToFile(jSONObject, appendPathComponent);
                            } catch (IOException e5) {
                                throw new CodePushUnknownException(str5, e5);
                            }
                        } catch (MalformedURLException e6) {
                            e = e6;
                            str3 = "Error closing IO resources.";
                            str4 = optString2;
                        } catch (Throwable th6) {
                            th = th6;
                            str3 = "Error closing IO resources.";
                        }
                    } catch (MalformedURLException e7) {
                        e = e7;
                        str3 = "Error closing IO resources.";
                        str4 = optString2;
                        httpURLConnection = httpURLConnection3;
                    } catch (Throwable th7) {
                        th = th7;
                        str3 = "Error closing IO resources.";
                        httpURLConnection = httpURLConnection3;
                    }
                } catch (MalformedURLException e8) {
                    e = e8;
                    str3 = "Error closing IO resources.";
                    fileOutputStream = fileOutputStream2;
                    str4 = optString2;
                    httpURLConnection2 = httpURLConnection3;
                    bufferedOutputStream2 = null;
                } catch (Throwable th8) {
                    th = th8;
                    str3 = "Error closing IO resources.";
                    fileOutputStream = fileOutputStream2;
                    httpURLConnection = httpURLConnection3;
                    bufferedOutputStream = null;
                }
            } catch (MalformedURLException e9) {
                e = e9;
                str3 = "Error closing IO resources.";
                str4 = optString2;
                httpURLConnection2 = httpURLConnection3;
                bufferedOutputStream2 = null;
                fileOutputStream = null;
                throw new CodePushMalformedDataException(str4, e);
            } catch (Throwable th9) {
                th = th9;
                str3 = "Error closing IO resources.";
                httpURLConnection = httpURLConnection3;
                bufferedOutputStream = null;
                fileOutputStream = null;
                if (bufferedOutputStream != null) {
                }
                if (fileOutputStream != null) {
                }
                if (bufferedInputStream != null) {
                }
                if (httpURLConnection != null) {
                }
                throw th;
            }
        } catch (MalformedURLException e10) {
            e = e10;
            str3 = "Error closing IO resources.";
            str4 = optString2;
            httpURLConnection2 = null;
        } catch (Throwable th10) {
            th = th10;
            str3 = "Error closing IO resources.";
            bufferedOutputStream = null;
            bufferedInputStream = null;
            fileOutputStream = null;
            httpURLConnection = null;
        }
    }

    public void installPackage(JSONObject jSONObject, boolean z) {
        String optString = jSONObject.optString("packageHash", null);
        JSONObject currentPackageInfo = getCurrentPackageInfo();
        String optString2 = currentPackageInfo.optString(CodePushConstants.CURRENT_PACKAGE_KEY, null);
        if (optString == null || !optString.equals(optString2)) {
            if (z) {
                String currentPackageFolderPath = getCurrentPackageFolderPath();
                if (currentPackageFolderPath != null) {
                    FileUtils.deleteDirectoryAtPath(currentPackageFolderPath);
                }
            } else {
                String previousPackageHash = getPreviousPackageHash();
                if (previousPackageHash != null && !previousPackageHash.equals(optString)) {
                    FileUtils.deleteDirectoryAtPath(getPackageFolderPath(previousPackageHash));
                }
                CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.PREVIOUS_PACKAGE_KEY, currentPackageInfo.optString(CodePushConstants.CURRENT_PACKAGE_KEY, null));
            }
            CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.CURRENT_PACKAGE_KEY, optString);
            updateCurrentPackageInfo(currentPackageInfo);
        }
    }

    public void rollbackPackage() {
        JSONObject currentPackageInfo = getCurrentPackageInfo();
        FileUtils.deleteDirectoryAtPath(getCurrentPackageFolderPath());
        CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.CURRENT_PACKAGE_KEY, currentPackageInfo.optString(CodePushConstants.PREVIOUS_PACKAGE_KEY, null));
        CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.PREVIOUS_PACKAGE_KEY, null);
        updateCurrentPackageInfo(currentPackageInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x007a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:63:0x007a */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r11v8 */
    public void downloadAndReplaceCurrentBundle(String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        Object obj;
        BufferedOutputStream bufferedOutputStream;
        Object obj2;
        MalformedURLException e;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                } catch (MalformedURLException e2) {
                    e = e2;
                    obj = null;
                    obj2 = obj;
                    e = e;
                    throw new CodePushMalformedDataException(str, e);
                } catch (Throwable th) {
                    th = th;
                    str2 = 0;
                    bufferedInputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
            }
        } catch (MalformedURLException e3) {
            e = e3;
            obj = null;
        } catch (Throwable th3) {
            th = th3;
            str2 = 0;
            httpURLConnection = null;
            bufferedInputStream = null;
        }
        try {
            File file = new File(getCurrentPackageBundlePath(str2));
            file.delete();
            str2 = new FileOutputStream(file);
            try {
                BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(str2, 262144);
                try {
                    byte[] bArr = new byte[262144];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 262144);
                        if (read >= 0) {
                            bufferedOutputStream3.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (IOException e4) {
                                throw new CodePushUnknownException("Error closing IO resources.", e4);
                            }
                        }
                    }
                    bufferedOutputStream3.close();
                    str2.close();
                    bufferedInputStream.close();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (MalformedURLException e5) {
                    e = e5;
                    throw new CodePushMalformedDataException(str, e);
                }
            } catch (MalformedURLException e6) {
                e = e6;
            } catch (Throwable th4) {
                th = th4;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e7) {
                        throw new CodePushUnknownException("Error closing IO resources.", e7);
                    }
                }
                if (str2 != 0) {
                    str2.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (MalformedURLException e8) {
            e = e8;
            obj2 = null;
            e = e;
            throw new CodePushMalformedDataException(str, e);
        } catch (Throwable th5) {
            th = th5;
            str2 = 0;
        }
    }

    public void clearUpdates() {
        FileUtils.deleteDirectoryAtPath(getCodePushPath());
    }
}
