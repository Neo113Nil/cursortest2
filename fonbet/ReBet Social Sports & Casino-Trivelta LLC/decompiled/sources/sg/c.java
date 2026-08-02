package sg;

import java.nio.charset.Charset;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rg.AbstractC6281b;
import rg.AbstractC6282c;
import rg.C6280a;
import sg.C6365a;
import sg.e;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f64893a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f64894b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byte[] a(byte[] key, byte[] id2) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(id2, "id");
            byte[] bArr = new byte[key.length];
            int length = key.length;
            for (int i10 = 0; i10 < length; i10++) {
                bArr[i10] = (byte) (key[i10] ^ id2[i10 % id2.length]);
            }
            return bArr;
        }

        public a() {
        }
    }

    static {
        Logger logger = Logger.getLogger(c.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f64894b = logger;
    }

    public final String a(d dVar, String str, PrivateKey privateKey) {
        try {
        } catch (Exception unused) {
        } catch (e e10) {
            throw e10;
        }
        if (dVar == null) {
            f64894b.log(Level.WARNING, "WMSSMError -- > WMSSecureMessage is null. Unable to process.");
            return null;
        }
        C6365a c10 = dVar.c();
        AbstractC6281b.a a10 = AbstractC6281b.a(dVar.a());
        byte[] d10 = dVar.d();
        if (c10.a(C6365a.EnumC0904a.isSecKeyEncrypted)) {
            d10 = AbstractC6282c.a(dVar.d(), privateKey);
        }
        if (c10.a(C6365a.EnumC0904a.isEncoded)) {
            if (str == null) {
                throw new e(e.a.WMS_SEC_202, "ENTITY_ID_NULL");
            }
            a aVar = f64893a;
            Intrinsics.checkNotNull(d10);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            d10 = aVar.a(d10, bytes);
        }
        byte[] a11 = C6280a.f64381a.a(Arrays.copyOfRange(d10, 0, 32), Arrays.copyOfRange(d10, 32, 44), a10, dVar.b());
        Charset forName2 = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName2, "forName(...)");
        return new String(a11, forName2);
    }
}
