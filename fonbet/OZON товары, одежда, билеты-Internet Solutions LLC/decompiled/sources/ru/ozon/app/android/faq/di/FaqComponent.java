package ru.ozon.app.android.faq.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.faq.state.FaqVOStorage;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/faq/di/FaqComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/faq/state/FaqVOStorage;", "getFaqStorage", "()Lru/ozon/app/android/faq/state/FaqVOStorage;", "faqStorage", "Companion", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FaqComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/faq/di/FaqComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/faq/di/FaqComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/faq/di/FaqComponent;", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final FaqComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new FaqComponent() { // from class: ru.ozon.app.android.faq.di.FaqComponent$Companion$create$1

                /* renamed from: faqStorage$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j faqStorage = k.b(FaqComponent$Companion$create$1$faqStorage$2.INSTANCE);

                @Override // ru.ozon.app.android.faq.di.FaqComponent
                public FaqVOStorage getFaqStorage() {
                    return (FaqVOStorage) this.faqStorage.getValue();
                }
            };
        }
    }

    @NotNull
    FaqVOStorage getFaqStorage();
}
