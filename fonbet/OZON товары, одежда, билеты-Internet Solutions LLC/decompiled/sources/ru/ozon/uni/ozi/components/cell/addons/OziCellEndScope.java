package ru.ozon.uni.ozi.components.cell.addons;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import a1.c;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.compose.tokens.UniPaddings;
import ru.ozon.uni.core.compose.tokens.UniRadii;
import ru.ozon.uni.core.compose.tokens.UniResourceIcons;
import ru.ozon.uni.ozi.components.cell.addons.OziCellScope;
import ru.ozon.uni.ozi.theme.OziTheme;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/ozi/components/cell/addons/OziCellEndScope;", "Lru/ozon/uni/ozi/components/cell/addons/OziCellScope;", "<init>", "()V", "Landroidx/compose/ui/e;", "modifier", "Lq1/b;", "icon", "Ll1/Z;", "iconColor", "Le1/b$c;", "verticalAlignment", "", "Icon-cf5BqRc", "(Landroidx/compose/ui/e;Lq1/b;JLe1/b$c;LS0/k;II)V", "Icon", "Lru/ozon/uni/ozi/components/cell/addons/OziCellScope$AddonMarker;", "addonMarker", "Lru/ozon/uni/ozi/components/cell/addons/OziCellScope$AddonMarker;", "getAddonMarker$uni_release", "()Lru/ozon/uni/ozi/components/cell/addons/OziCellScope$AddonMarker;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziCellEndScope extends OziCellScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final OziCellEndScope INSTANCE = new OziCellEndScope();

    @NotNull
    private final OziCellScope.AddonMarker addonMarker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/cell/addons/OziCellEndScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/uni/ozi/components/cell/addons/OziCellEndScope;", "getINSTANCE$uni_release", "()Lru/ozon/uni/ozi/components/cell/addons/OziCellEndScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziCellEndScope getINSTANCE$uni_release() {
            return OziCellEndScope.INSTANCE;
        }

        private Companion() {
        }
    }

    private OziCellEndScope() {
        super(null);
        this.addonMarker = OziCellScope.AddonMarker.End;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0083  */
    /* renamed from: Icon-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3078Iconcf5BqRc(e eVar, AbstractC8972b abstractC8972b, long j11, InterfaceC6250b.c cVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        AbstractC8972b abstractC8972b2;
        long j12;
        InterfaceC6250b.c cVar2;
        OziCellScope oziCellScope;
        e eVar3;
        AbstractC8972b abstractC8972b3;
        long j13;
        InterfaceC6250b.c i14;
        e eVar4;
        InterfaceC6250b.c cVar3;
        J0 m02;
        int i15;
        int i16;
        C3969l u11 = interfaceC3967k.u(-72771824);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                abstractC8972b2 = abstractC8972b;
                if (u11.n(abstractC8972b2)) {
                    i16 = 32;
                    i13 |= i16;
                }
            } else {
                abstractC8972b2 = abstractC8972b;
            }
            i16 = 16;
            i13 |= i16;
        } else {
            abstractC8972b2 = abstractC8972b;
        }
        if ((i11 & 384) == 0) {
            if ((i12 & 4) == 0) {
                j12 = j11;
                if (u11.s(j12)) {
                    i15 = 256;
                    i13 |= i15;
                }
            } else {
                j12 = j11;
            }
            i15 = UserVerificationMethods.USER_VERIFY_PATTERN;
            i13 |= i15;
        } else {
            j12 = j11;
        }
        int i18 = i12 & 8;
        if (i18 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            cVar2 = cVar;
            i13 |= u11.n(cVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            if ((i12 & 16) == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                oziCellScope = this;
                i13 |= u11.n(oziCellScope) ? 16384 : 8192;
                if ((i13 & 9363) == 9362 || !u11.b()) {
                    u11.Q0();
                    if ((i11 & 1) != 0 || u11.w0()) {
                        eVar3 = i17 != 0 ? e.f40358c0 : eVar2;
                        if ((i12 & 2) != 0) {
                            OziTheme.INSTANCE.getIcons();
                            u11.B(-886331929);
                            abstractC8972b3 = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                            u11.K();
                            i13 &= -113;
                        } else {
                            abstractC8972b3 = abstractC8972b2;
                        }
                        if ((i12 & 4) != 0) {
                            j13 = OziTheme.INSTANCE.getColors(u11, UniResourceIcons.$stable | UniPaddings.$stable | UniRadii.$stable).getGraphicQuaternaryTransparent();
                            i13 &= -897;
                        } else {
                            j13 = j12;
                        }
                        if (i18 != 0) {
                            i14 = InterfaceC6250b.a.i();
                            u11.j0();
                            e eVar5 = eVar3;
                            oziCellScope.m3079AddonBuilder942rkJo(T.j(eVar5, 8, 0.0f, 0.0f, 0.0f, 14), i14, 0.0f, c.c(2092278949, new OziCellEndScope$Icon$1(abstractC8972b3, j13), u11), u11, ((i13 >> 6) & 112) | 3072 | (i13 & 57344), 4);
                            eVar4 = eVar5;
                            cVar3 = i14;
                            j12 = j13;
                            abstractC8972b2 = abstractC8972b3;
                        }
                    } else {
                        u11.j();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        eVar3 = eVar2;
                        abstractC8972b3 = abstractC8972b2;
                        j13 = j12;
                    }
                    i14 = cVar2;
                    u11.j0();
                    e eVar52 = eVar3;
                    oziCellScope.m3079AddonBuilder942rkJo(T.j(eVar52, 8, 0.0f, 0.0f, 0.0f, 14), i14, 0.0f, c.c(2092278949, new OziCellEndScope$Icon$1(abstractC8972b3, j13), u11), u11, ((i13 >> 6) & 112) | 3072 | (i13 & 57344), 4);
                    eVar4 = eVar52;
                    cVar3 = i14;
                    j12 = j13;
                    abstractC8972b2 = abstractC8972b3;
                } else {
                    u11.j();
                    eVar4 = eVar2;
                    cVar3 = cVar2;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new OziCellEndScope$Icon$2(this, eVar4, abstractC8972b2, j12, cVar3, i11, i12));
                    return;
                }
                return;
            }
            oziCellScope = this;
            if ((i13 & 9363) == 9362) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i17 != 0) {
            }
            if ((i12 & 2) != 0) {
            }
            if ((i12 & 4) != 0) {
            }
            if (i18 != 0) {
            }
            i14 = cVar2;
            u11.j0();
            e eVar522 = eVar3;
            oziCellScope.m3079AddonBuilder942rkJo(T.j(eVar522, 8, 0.0f, 0.0f, 0.0f, 14), i14, 0.0f, c.c(2092278949, new OziCellEndScope$Icon$1(abstractC8972b3, j13), u11), u11, ((i13 >> 6) & 112) | 3072 | (i13 & 57344), 4);
            eVar4 = eVar522;
            cVar3 = i14;
            j12 = j13;
            abstractC8972b2 = abstractC8972b3;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        cVar2 = cVar;
        if ((i12 & 16) == 0) {
        }
        oziCellScope = this;
        if ((i13 & 9363) == 9362) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i17 != 0) {
        }
        if ((i12 & 2) != 0) {
        }
        if ((i12 & 4) != 0) {
        }
        if (i18 != 0) {
        }
        i14 = cVar2;
        u11.j0();
        e eVar5222 = eVar3;
        oziCellScope.m3079AddonBuilder942rkJo(T.j(eVar5222, 8, 0.0f, 0.0f, 0.0f, 14), i14, 0.0f, c.c(2092278949, new OziCellEndScope$Icon$1(abstractC8972b3, j13), u11), u11, ((i13 >> 6) & 112) | 3072 | (i13 & 57344), 4);
        eVar4 = eVar5222;
        cVar3 = i14;
        j12 = j13;
        abstractC8972b2 = abstractC8972b3;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    @Override // ru.ozon.uni.ozi.components.cell.addons.OziCellScope
    @NotNull
    /* renamed from: getAddonMarker$uni_release, reason: from getter */
    public OziCellScope.AddonMarker getAddonMarker() {
        return this.addonMarker;
    }
}
