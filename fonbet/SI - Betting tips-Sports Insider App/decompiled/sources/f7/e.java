package f7;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f9477a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f9478b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature f9479c;

    /* renamed from: d, reason: collision with root package name */
    public static final Feature[] f9480d;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", -1, 9L, true);
        Feature feature2 = new Feature("auth_api_credentials_sign_out", -1, 2L, true);
        f9477a = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", -1, 1L, true);
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", -1, 1L, true);
        Feature feature5 = new Feature("auth_api_credentials_clear_token", -1, 1L, true);
        Feature feature6 = new Feature("auth_api_credentials_save_password", -1, 4L, true);
        f9478b = feature6;
        Feature feature7 = new Feature("auth_api_credentials_get_sign_in_intent", -1, 6L, true);
        f9479c = feature7;
        f9480d = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, new Feature("auth_api_credentials_save_account_linking_token", -1, 3L, true), new Feature("auth_api_credentials_get_phone_number_hint_intent", -1, 3L, true), new Feature("auth_api_credentials_verify_with_google", -1, 1L, true), new Feature("auth_api_credentials_credential_provider", -1, 1L, true), new Feature("auth_api_credentials_save_webauthn_credential_specifics", -1, 1L, true), new Feature("auth_api_credentials_delete_webauthn_credential_specifics", -1, 1L, false), new Feature("auth_api_credentials_list_webauthn_credential_specifics", -1, 1L, true), new Feature("auth_api_credentials_get_google_passkey_for_export", -1, 2L, true), new Feature("auth_api_credentials_get_authentication_intent", -1, 1L, true), new Feature("auth_api_credentials_get_registration_intent", -1, 1L, true), new Feature("auth_api_credentials_check_key_availability", -1, 1L, true), new Feature("auth_api_credentials_has_discoverable_key", -1, 1L, true), new Feature("auth_api_credentials_validate_calling_browser", -1, 1L, true), new Feature("auth_api_credentials_validate_rp_id_and_calling_package", -1, 1L, true), new Feature("auth_api_credentials_get_credential_list_for_browser", -1, 1L, true), new Feature("auth_api_credentials_update_webauthn_credential_specifics", -1, 1L, true)};
    }

    public static ApiMetadata a() {
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        Parcelable.Creator<ApiMetadata> creator = ApiMetadata.CREATOR;
        ApiMetadata apiMetadata = new ApiMetadata(complianceOptions, false);
        apiMetadata.f4452c = false;
        return apiMetadata;
    }

    public static String b(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i5 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length || (indexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, indexOf);
            sb2.append(d(objArr[i5]));
            i10 = indexOf + 2;
            i5++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i5 < length) {
            String str2 = " [";
            while (i5 < objArr.length) {
                sb2.append(str2);
                sb2.append(d(objArr[i5]));
                i5++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void c(int i5, int i10) {
        String b10;
        if (i5 < 0 || i5 >= i10) {
            if (i5 < 0) {
                b10 = b("%s (%s) must not be negative", "index", Integer.valueOf(i5));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(r4.k.o(new StringBuilder(String.valueOf(i10).length() + 15), "negative size: ", i10));
                }
                b10 = b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(b10);
        }
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String m6 = d9.e.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m6), (Throwable) e7);
            String name2 = e7.getClass().getName();
            StringBuilder sb2 = new StringBuilder(m6.length() + 8 + name2.length() + 1);
            r4.k.s(sb2, "<", m6, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static void e(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? f(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? f(i10, i11, "end index") : b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    public static String f(int i5, int i10, String str) {
        if (i5 < 0) {
            return b("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(r4.k.o(new StringBuilder(String.valueOf(i10).length() + 15), "negative size: ", i10));
    }
}
