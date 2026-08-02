package ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.di;

import WZ.l;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.data.AccountListMobileMapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0002\t\nJ\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/di/AccountListMobileComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileMapper;", "getAccountListMobileMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileMapper;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Companion", "Factory", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AccountListMobileComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/di/AccountListMobileComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/di/AccountListMobileComponent;", "createComponent", "(Lk20/g;)Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/di/AccountListMobileComponent;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final AccountListMobileComponent createComponent(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return DaggerAccountListMobileComponent.factory().create((RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/di/AccountListMobileComponent$Factory;", "", "create", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/di/AccountListMobileComponent;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public interface Factory {
        @NotNull
        AccountListMobileComponent create(@NotNull RetainComposerComponentApi retainComposerComponentApi);
    }

    @NotNull
    AccountListMobileMapper getAccountListMobileMapper();

    @NotNull
    l getTokenizedAnalytics();
}
