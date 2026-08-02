package ru.ozon.app.android.update.di.module;

import Ld0.c;
import ej.InterfaceC6376e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/update/di/module/InAppUpdateModule;", "", "Companion", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class InAppUpdateModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/update/di/module/InAppUpdateModule$Companion;", "", "<init>", "()V", "LLd0/c;", "diStore", "Lej/e;", "provideOzonInAppUpdateSdkManager$in_app_update_prodGoogleAllVendorsRelease", "(LLd0/c;)Lej/e;", "provideOzonInAppUpdateSdkManager", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC6376e provideOzonInAppUpdateSdkManager$in_app_update_prodGoogleAllVendorsRelease(@NotNull c diStore) {
            Intrinsics.checkNotNullParameter(diStore, "diStore");
            return (InterfaceC6376e) diStore.e(InterfaceC6376e.class);
        }

        private Companion() {
        }
    }
}
