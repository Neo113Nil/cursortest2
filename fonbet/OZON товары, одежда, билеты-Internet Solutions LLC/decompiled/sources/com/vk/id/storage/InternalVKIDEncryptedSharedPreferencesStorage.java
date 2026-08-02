package com.vk.id.storage;

import N4.a;
import N4.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.storage.InternalVKIDEncryptedSharedPreferencesStorage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/vk/id/storage/InternalVKIDEncryptedSharedPreferencesStorage;", "Lcom/vk/id/storage/InternalVKIDPreferencesStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/SharedPreferences;", "createSharedPreferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "set", "(Ljava/lang/String;Ljava/lang/String;)V", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "sharedPreferences$delegate", "LSc/j;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIDEncryptedSharedPreferencesStorage implements InternalVKIDPreferencesStorage {

    /* renamed from: sharedPreferences$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j sharedPreferences;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vk/id/storage/InternalVKIDEncryptedSharedPreferencesStorage$Companion;", "", "<init>", "()V", "FILE_NAME", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public InternalVKIDEncryptedSharedPreferencesStorage(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.sharedPreferences = k.b(new Function0() { // from class: Da.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SharedPreferences sharedPreferences_delegate$lambda$0;
                sharedPreferences_delegate$lambda$0 = InternalVKIDEncryptedSharedPreferencesStorage.sharedPreferences_delegate$lambda$0(InternalVKIDEncryptedSharedPreferencesStorage.this, context);
                return sharedPreferences_delegate$lambda$0;
            }
        });
    }

    private final SharedPreferences createSharedPreferences(Context context) {
        a b11 = a.b("vkid_encrypted_shared_prefs", c.a(c.f18682a), context, a.c.AES256_SIV, a.d.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(b11, "create(...)");
        return b11;
    }

    private final SharedPreferences getSharedPreferences() {
        return (SharedPreferences) this.sharedPreferences.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences sharedPreferences_delegate$lambda$0(InternalVKIDEncryptedSharedPreferencesStorage internalVKIDEncryptedSharedPreferencesStorage, Context context) {
        try {
            return internalVKIDEncryptedSharedPreferencesStorage.createSharedPreferences(context);
        } catch (Throwable unused) {
            context.deleteSharedPreferences("vkid_encrypted_shared_prefs");
            return internalVKIDEncryptedSharedPreferencesStorage.createSharedPreferences(context);
        }
    }

    @Override // com.vk.id.storage.InternalVKIDPreferencesStorage
    public String getString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getSharedPreferences().getString(key, null);
    }

    @Override // com.vk.id.storage.InternalVKIDPreferencesStorage
    public void set(@NotNull String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putString(key, value);
        edit.commit();
    }
}
