package ru.ozon.uni.components.disclaimer.addons;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.InterfaceC2801g;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.components.button.UniButtonKt;
import ru.ozon.uni.components.button.UniButtonSize;
import ru.ozon.uni.components.button.UniButtonStyleType;
import ru.ozon.uni.components.disclaimer.UniDisclaimerTestTags;
import ru.ozon.uni.components.disclaimer.addons.UniDisclaimerAdditionalButtonScope;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.UniTestTagsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/components/disclaimer/addons/UniDisclaimerAdditionalButtonScope;", "", "<init>", "()V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/e;", "modifier", "UniDisclaimerAdditionalButton", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/e;LS0/k;II)V", "Lkotlin/Function1;", "button", "UniDisclaimerAdditionalButtonContainer$uni_release", "(Landroidx/compose/ui/e;Lfd/n;LS0/k;II)V", "UniDisclaimerAdditionalButtonContainer", "Companion", "AdditionalButtonAddonMarker", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniDisclaimerAdditionalButtonScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final UniDisclaimerAdditionalButtonScope INSTANCE = new UniDisclaimerAdditionalButtonScope();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/components/disclaimer/addons/UniDisclaimerAdditionalButtonScope$AdditionalButtonAddonMarker;", "", "<init>", "()V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AdditionalButtonAddonMarker {

        @NotNull
        public static final AdditionalButtonAddonMarker INSTANCE = new AdditionalButtonAddonMarker();

        private AdditionalButtonAddonMarker() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/components/disclaimer/addons/UniDisclaimerAdditionalButtonScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/uni/components/disclaimer/addons/UniDisclaimerAdditionalButtonScope;", "getINSTANCE$uni_release", "()Lru/ozon/uni/components/disclaimer/addons/UniDisclaimerAdditionalButtonScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UniDisclaimerAdditionalButtonScope getINSTANCE$uni_release() {
            return UniDisclaimerAdditionalButtonScope.INSTANCE;
        }

        private Companion() {
        }
    }

    public final void UniDisclaimerAdditionalButton(@NotNull String title, @NotNull Function0<Unit> onClick, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        interfaceC3967k.o(-1246421077);
        e eVar2 = (i12 & 4) != 0 ? e.f40358c0 : eVar;
        UniButtonSize uniButtonSize = UniButtonSize.SIZE_400;
        UniTheme uniTheme = UniTheme.INSTANCE;
        int i13 = UniTheme.$stable;
        long bgOverlap = uniTheme.getColors(interfaceC3967k, i13).getBgOverlap();
        long textPrimary = uniTheme.getColors(interfaceC3967k, i13).getTextPrimary();
        j11 = C7807Z.f72259m;
        j12 = C7807Z.f72259m;
        j13 = C7807Z.f72259m;
        C7807Z m11 = C7807Z.m(j13);
        j14 = C7807Z.f72259m;
        j15 = C7807Z.f72259m;
        UniButtonStyleType.Custom custom = new UniButtonStyleType.Custom(bgOverlap, textPrimary, j11, j12, m11, j14, j15, (DefaultConstructorMarker) null);
        e b11 = a.b(UniTestTagsKt.uniTestTag(eVar2, UniDisclaimerTestTags.AdditionalButton, null, interfaceC3967k, ((i11 >> 6) & 14) | 48, 2), AdditionalButtonAddonMarker.INSTANCE);
        P9.a.b(b11, "additionalButton");
        UniButtonKt.UniButton(title, b11, null, null, null, null, onClick, false, false, false, false, custom, uniButtonSize, false, null, interfaceC3967k, (i11 & 14) | ((i11 << 15) & 3670016), 384, 26556);
        interfaceC3967k.k();
    }

    public final void UniDisclaimerAdditionalButtonContainer$uni_release(e eVar, @NotNull InterfaceC6511n<? super UniDisclaimerAdditionalButtonScope, ? super InterfaceC3967k, ? super Integer, Unit> button, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(button, "button");
        C3969l u11 = interfaceC3967k.u(-518035605);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(button) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(this) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            u11.o(1609489099);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new V() { // from class: ru.ozon.uni.components.disclaimer.addons.UniDisclaimerAdditionalButtonScope$UniDisclaimerAdditionalButtonContainer$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.uni.components.disclaimer.addons.UniDisclaimerAdditionalButtonScope$UniDisclaimerAdditionalButtonContainer$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ m0 $buttonPlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(m0 m0Var) {
                            super(1);
                            this.$buttonPlaceable = m0Var;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            m0 m0Var = this.$buttonPlaceable;
                            if (m0Var != null) {
                                layout.d(m0Var, 0, 0, 0.0f);
                            }
                        }
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
                    
                        if (r2 == false) goto L8;
                     */
                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurables, "measurables");
                        Iterator<T> it = measurables.iterator();
                        Object obj = null;
                        boolean z11 = false;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (Intrinsics.d(a.a((U) next), UniDisclaimerAdditionalButtonScope.AdditionalButtonAddonMarker.INSTANCE)) {
                                    if (z11) {
                                        break;
                                    }
                                    z11 = true;
                                    obj = next;
                                }
                            }
                        }
                        obj = null;
                        U u12 = (U) obj;
                        if (UniGlobalConfig.INSTANCE.getEnableStrictMode() && u12 == null) {
                            throw new IllegalArgumentException("Можно вызывать только функции из соответствующего scope");
                        }
                        m0 a02 = u12 != null ? u12.a0(j11) : null;
                        z02 = Layout.z0(a02 != null ? a02.r0() : 0, a02 != null ? a02.o0() : 0, kotlin.collections.U.c(), new AnonymousClass2(a02));
                        return z02;
                    }
                };
                u11.x(C11);
            }
            V v11 = (V) C11;
            u11.k();
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, eVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f11 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            button.invoke(this, u11, Integer.valueOf(((i13 >> 6) & 14) | (i13 & 112)));
            u11.f();
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new UniDisclaimerAdditionalButtonScope$UniDisclaimerAdditionalButtonContainer$3(this, eVar2, button, i11, i12));
        }
    }
}
