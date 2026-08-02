package expo.modules.asset;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: FileUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"getMD5HashOfFileContent", "", "file", "Ljava/io/File;", "expo-asset_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileUtilsKt {
    public static final String getMD5HashOfFileContent(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            byte[] bArr = new byte[8192];
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileInputStream fileInputStream2 = fileInputStream;
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, null);
                        byte[] digest = messageDigest.digest();
                        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
                        return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: expo.modules.asset.FileUtilsKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                CharSequence mD5HashOfFileContent$lambda$1;
                                mD5HashOfFileContent$lambda$1 = FileUtilsKt.getMD5HashOfFileContent$lambda$1(((Byte) obj).byteValue());
                                return mD5HashOfFileContent$lambda$1;
                            }
                        }, 30, (Object) null);
                    }
                }
            } finally {
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getMD5HashOfFileContent$lambda$1(byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
