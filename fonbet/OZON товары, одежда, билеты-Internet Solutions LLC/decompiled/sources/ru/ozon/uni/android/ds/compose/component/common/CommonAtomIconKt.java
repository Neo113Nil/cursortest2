package ru.ozon.uni.android.ds.compose.component.common;

import P0.E;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a3\u0010\n\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "defaultTint", "", "contentDescription", "", "ScaleIcon-cf5BqRc", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Landroidx/compose/ui/e;JLjava/lang/String;LS0/k;II)V", "ScaleIcon", "dto", "ScaledIcon-cf5BqRc", "ScaledIcon", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommonAtomIconKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* renamed from: ScaleIcon-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1702ScaleIconcf5BqRc(@NotNull CommonAtomIconDTO ScaleIcon, e eVar, long j11, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j12;
        int i14;
        String str2;
        C3969l c3969l;
        String str3;
        long j13;
        e eVar2;
        J0 m02;
        Intrinsics.checkNotNullParameter(ScaleIcon, "$this$ScaleIcon");
        C3969l u11 = interfaceC3967k.u(207387642);
        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(ScaleIcon) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            j12 = j11;
            i13 |= u11.s(j12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                str2 = str;
                i13 |= u11.n(str2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    e eVar3 = i15 != 0 ? e.f40358c0 : eVar;
                    long j14 = i16 != 0 ? C7807Z.f72259m : j12;
                    if (i14 != 0) {
                        str2 = null;
                    }
                    int i17 = i13 & 8190;
                    e eVar4 = eVar3;
                    long j15 = j14;
                    String str4 = str2;
                    m1703ScaledIconcf5BqRc(ScaleIcon, eVar4, j15, str4, u11, i17, 0);
                    c3969l = u11;
                    str3 = str4;
                    j13 = j15;
                    eVar2 = eVar4;
                } else {
                    u11.j();
                    eVar2 = eVar;
                    c3969l = u11;
                    j13 = j12;
                    str3 = str2;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new CommonAtomIconKt$ScaleIcon$1(ScaleIcon, eVar2, j13, str3, i11, i12));
                    return;
                }
                return;
            }
            str2 = str;
            if ((i13 & 1171) == 1170) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            int i172 = i13 & 8190;
            e eVar42 = eVar3;
            long j152 = j14;
            String str42 = str2;
            m1703ScaledIconcf5BqRc(ScaleIcon, eVar42, j152, str42, u11, i172, 0);
            c3969l = u11;
            str3 = str42;
            j13 = j152;
            eVar2 = eVar42;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        j12 = j11;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        str2 = str;
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        int i1722 = i13 & 8190;
        e eVar422 = eVar3;
        long j1522 = j14;
        String str422 = str2;
        m1703ScaledIconcf5BqRc(ScaleIcon, eVar422, j1522, str422, u11, i1722, 0);
        c3969l = u11;
        str3 = str422;
        j13 = j1522;
        eVar2 = eVar422;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0060  */
    /* renamed from: ScaledIcon-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1703ScaledIconcf5BqRc(@NotNull CommonAtomIconDTO dto, e eVar, long j11, String str, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j12;
        int i14;
        String str2;
        UniIconToken byId;
        long w11;
        C3969l c3969l;
        String str3;
        e eVar2;
        long j13;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-37943256);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        int i16 = i12 & 4;
        if (i16 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            j12 = j11;
            i13 |= u11.s(j12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                str2 = str;
                i13 |= u11.n(str2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    if (i15 != 0) {
                        eVar = e.f40358c0;
                    }
                    e eVar3 = eVar;
                    long j14 = i16 != 0 ? C7807Z.f72259m : j12;
                    String str4 = i14 != 0 ? null : str2;
                    byId = UniTheme.INSTANCE.getIconTokens().getById(dto.getIcon());
                    if (byId == null) {
                        J0 m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new CommonAtomIconKt$ScaledIcon$iconToken$1(dto, eVar3, j14, str4, i11, i12));
                            return;
                        }
                        return;
                    }
                    long j15 = j14;
                    u11.o(-575841314);
                    if (byId.getIsMulticolor()) {
                        w11 = C7807Z.f72259m;
                    } else {
                        C7807Z c7807z = TokenParserKt.tokenToColor(dto.getTintColor(), u11, 0);
                        w11 = c7807z != null ? c7807z.w() : j15;
                    }
                    u11.k();
                    String str5 = str4;
                    c3969l = u11;
                    E.a(TokensExtKt.getIcon(byId, u11, UniIconToken.$stable), str5, eVar3, w11, c3969l, ((i13 >> 6) & 112) | ((i13 << 3) & 896));
                    str3 = str5;
                    eVar2 = eVar3;
                    j13 = j15;
                } else {
                    u11.j();
                    eVar2 = eVar;
                    c3969l = u11;
                    j13 = j12;
                    str3 = str2;
                }
                J0 m03 = c3969l.m0();
                if (m03 != null) {
                    m03.G(new CommonAtomIconKt$ScaledIcon$1(dto, eVar2, j13, str3, i11, i12));
                    return;
                }
                return;
            }
            str2 = str;
            if ((i13 & 1171) == 1170) {
            }
            if (i15 != 0) {
            }
            e eVar32 = eVar;
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            byId = UniTheme.INSTANCE.getIconTokens().getById(dto.getIcon());
            if (byId == null) {
            }
        }
        j12 = j11;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        str2 = str;
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        e eVar322 = eVar;
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        byId = UniTheme.INSTANCE.getIconTokens().getById(dto.getIcon());
        if (byId == null) {
        }
    }
}
