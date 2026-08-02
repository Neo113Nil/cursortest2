package sg;

import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class e extends Throwable {

    /* renamed from: d, reason: collision with root package name */
    public static Logger f64901d = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public String f64902a;

    /* renamed from: b, reason: collision with root package name */
    public String f64903b;

    /* renamed from: c, reason: collision with root package name */
    public String f64904c;

    public enum a {
        WMS_SEC_100("UNKNOWN_EXCEPTION"),
        WMS_SEC_101("WMS_SECURITY_MANAGER_NOT_INITIALIZED"),
        WMS_SEC_102("EXCEPTION_WHILE_WMSSECURITY_MANAGER_INIT"),
        WMS_SEC_103("EXCEPTION_WHILE_WMSKEYSTORE_LOADER"),
        WMS_SEC_104("KEYPAIR_STORE_IS_NULL"),
        WMS_SEC_105("KEY_PAIR_NOT_PRESENT_API"),
        WMS_SEC_106("KEY_PAIR_NOT_PRESENT_CLUSTER"),
        WMS_SEC_107("KEY_PAIR_NOT_PRESENT_IDC"),
        WMS_SEC_108("UNSUPPORTED_CHARSET"),
        WMS_SEC_201("ENCRYPT_EXCEPTION"),
        WMS_SEC_202("DECRYPT_EXCEPTION"),
        WMS_SEC_203("RSA_ENCRYPT_EXCEPTION"),
        WMS_SEC_204("RSA_DECRYPT_EXCEPTION"),
        WMS_SEC_205("AES_ENCRYPT_EXCEPTION"),
        WMS_SEC_206("AES_DECRYPT_EXCEPTION"),
        WMS_SEC_207("TRANSFORM_ENTITY_ID_NULL"),
        WMS_SEC_208("TRANSFORM_ENTITY_ID_NOT_VALID"),
        WMS_SEC_209("INVALID_ALGORITHM_TYPE_IN_ENCRYPT"),
        WMS_SEC_210("INVALID_ALGORITHM_TYPE_IN_DECRYPT"),
        WMS_SEC_211("EXCEPTION_WHILE_GENERATING_PUBLIC_KEY"),
        WMS_SEC_212("EXCEPTION_WHILE_GENERATING_PRIVATE_KEY"),
        WMS_SEC_213("INVALID_KEY_SPEC"),
        WMS_SEC_301("WMSSECUREMESSAGE_IS_NULL"),
        WMS_SEC_302("PAYLOAD_IS_NULL"),
        WMS_SEC_303("SEC_KEY_IS_ALREADY_ENCODED"),
        WMS_SEC_304("SEC_KEY_IS_NOT_ENCODED"),
        WMS_SEC_305("SEC_KEY_IS_ALREADY_ENCRYPTED"),
        WMS_SEC_306("SEC_KEY_IS_ALREADY_DECRYPTED");


        /* renamed from: a, reason: collision with root package name */
        public final String f64933a;

        a(String str) {
            this.f64933a = str;
        }

        public String b() {
            return name();
        }

        public String c() {
            return this.f64933a;
        }
    }

    public e(a aVar, String str) {
        super(aVar.c());
        this.f64904c = "WMSSecurityException";
        this.f64903b = aVar.b();
        this.f64902a = aVar.c();
        this.f64904c = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("WMSSecurity ERROR:");
        stringBuffer.append(this.f64903b);
        stringBuffer.append(":");
        stringBuffer.append(this.f64902a);
        if (this.f64904c != null) {
            stringBuffer.append(" EX: ");
            stringBuffer.append(this.f64904c);
        }
        return stringBuffer.toString();
    }
}
