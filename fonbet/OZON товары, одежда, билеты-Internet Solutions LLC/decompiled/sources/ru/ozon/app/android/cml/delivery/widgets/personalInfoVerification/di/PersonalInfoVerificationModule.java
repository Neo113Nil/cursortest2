package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di;

import I00.d;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.PersonalInfoVerificationConfig;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.PersonalInfoVerificationWidgetParser;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.buttons.PersonalInfoVerificationStickyButtonViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.PersonalInfoVerificationViewMapper;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationModule;", "", "<init>", "()V", "Ln20/i;", "providePersonalInfoVerificationWidget", "()Ln20/i;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersonalInfoVerificationModule {

    @NotNull
    public static final PersonalInfoVerificationModule INSTANCE = new PersonalInfoVerificationModule();

    private PersonalInfoVerificationModule() {
    }

    @NotNull
    public final i providePersonalInfoVerificationWidget() {
        final long[] jArr = {1};
        final String str = "cml";
        final String str2 = "personalInfoVerification";
        return new i(str, str2, jArr) { // from class: ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationModule$providePersonalInfoVerificationWidget$$inlined$WidgetFactory$1
            @Override // n20.i
            public InterfaceC7243a<? extends Object> config(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new PersonalInfoVerificationConfig(new PersonalInfoVerificationWidgetParser(ComposerWidgetComponentStorageKt.getJsonParser(storage)));
            }

            @Override // n20.i
            public InterfaceC8046a<?, ? extends c>[] viewMappers(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                PersonalInfoVerificationComponent personalInfoVerificationComponent = (PersonalInfoVerificationComponent) storage.getComponent(PersonalInfoVerificationComponent.class);
                return new d[]{new PersonalInfoVerificationViewMapper(personalInfoVerificationComponent), new PersonalInfoVerificationStickyButtonViewMapper(personalInfoVerificationComponent)};
            }

            @Override // n20.i
            public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
                Intrinsics.checkNotNullParameter(storage, "storage");
                return new C7473e[]{PersonalInfoVerificationComponent.Companion.create(storage)};
            }
        };
    }
}
