package g7;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f9880a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f9881b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature f9882c;

    /* renamed from: d, reason: collision with root package name */
    public static final Feature[] f9883d;

    static {
        Feature feature = new Feature("auth_blockstore", 3L);
        Feature feature2 = new Feature("blockstore_data_transfer", 1L);
        Feature feature3 = new Feature("blockstore_notify_app_restore", 1L);
        Feature feature4 = new Feature("blockstore_store_bytes_with_options", 2L);
        Feature feature5 = new Feature("blockstore_is_end_to_end_encryption_available", 1L);
        Feature feature6 = new Feature("blockstore_enable_cloud_backup", 1L);
        Feature feature7 = new Feature("blockstore_delete_bytes", 2L);
        Feature feature8 = new Feature("blockstore_retrieve_bytes_with_options", 3L);
        Feature feature9 = new Feature("auth_clear_restore_credential", 1L);
        f9880a = feature9;
        Feature feature10 = new Feature("auth_create_restore_credential", 1L);
        f9881b = feature10;
        Feature feature11 = new Feature("auth_get_restore_credential", 1L);
        f9882c = feature11;
        f9883d = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, feature11};
    }
}
