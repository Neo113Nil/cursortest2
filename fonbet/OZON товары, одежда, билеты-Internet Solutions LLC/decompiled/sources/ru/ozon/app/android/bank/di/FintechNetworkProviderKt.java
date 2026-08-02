package ru.ozon.app.android.bank.di;

import Ld0.c;
import We.B;
import We.E;
import b90.C5597d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import lm.C7970a;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8919b;
import pf0.AbstractC8922e;
import pf0.EnumC8923f;
import pf0.InterfaceC8924g;
import pf0.h;
import pf0.i;
import pf0.j;
import ru.ozon.app.android.fintech.flags.FintechUseEsk;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "isQaBuild", "isStage", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LLd0/c;", "ozonLimbDiStore", "Lb90/d;", "getFintechSingleNetworkClientProvider", "(ZZLru/ozon/app/android/network/abtool/FeatureChecker;LLd0/c;)Lb90/d;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FintechNetworkProviderKt {
    @NotNull
    public static final C5597d getFintechSingleNetworkClientProvider(boolean z11, boolean z12, @NotNull FeatureChecker featureChecker, @NotNull c ozonLimbDiStore) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
        if (!featureChecker.isEnabled(FintechUseEsk.INSTANCE)) {
            return C5597d.f55750c;
        }
        C5597d c5597d = new C5597d(true);
        c5597d.c(new C7970a(ozonLimbDiStore, z11, z12));
        return c5597d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E getFintechSingleNetworkClientProvider$lambda$1$lambda$0(c cVar, final boolean z11, final boolean z12, final List interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        return ((InterfaceC8924g) cVar.e(h.class)).y(new i() { // from class: ru.ozon.app.android.bank.di.FintechNetworkProviderKt$getFintechSingleNetworkClientProvider$1$1$1
            private final AbstractC8919b consumer = AbstractC8919b.a.f80501a;

            @Override // pf0.i
            public AbstractC8919b getConsumer() {
                return this.consumer;
            }

            @Override // pf0.i
            public List<AbstractC8922e> getInterceptors() {
                List<B> list = interceptors;
                final boolean z13 = z11;
                final boolean z14 = z12;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                for (final B b11 : list) {
                    arrayList.add(new AbstractC8922e(b11, z13, z14) { // from class: ru.ozon.app.android.bank.di.FintechNetworkProviderKt$getFintechSingleNetworkClientProvider$1$1$1$interceptors$1$1
                        private final B interceptor;
                        private final String key;
                        private final j ozonNetworkDevToolsLevel;
                        private final EnumC8923f type;

                        {
                            this.interceptor = b11;
                            this.ozonNetworkDevToolsLevel = (z13 || z14) ? j.QA_BUILDS_OR_AUTOTEST : j.PROD_BUILDS_ALL_USERS;
                            this.type = EnumC8923f.AppInterceptor;
                            String name = b11.getClass().getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            this.key = name;
                        }

                        @Override // pf0.AbstractC8922e
                        public B getInterceptor() {
                            return this.interceptor;
                        }

                        @Override // pf0.AbstractC8922e
                        public String getKey() {
                            return this.key;
                        }

                        @Override // pf0.AbstractC8922e
                        public j getOzonNetworkDevToolsLevel() {
                            return this.ozonNetworkDevToolsLevel;
                        }

                        @Override // pf0.AbstractC8922e
                        public EnumC8923f getType() {
                            return this.type;
                        }
                    });
                }
                return arrayList;
            }
        });
    }
}
