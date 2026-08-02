package ru.ozon.android.messenger.framework.presentation.common.popupmenu.action;

import android.content.Context;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.c;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f90813a;

    public f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f90813a = context;
    }

    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable, java.util.List<ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.c>] */
    /* JADX WARN: Type inference failed for: r18v2 */
    public final List<c> a(@NotNull q itemVO) {
        ?? r18;
        c.a a11;
        c.a a12;
        c.a a13;
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        ArrayList arrayList = new ArrayList();
        s f7 = r.f(itemVO);
        if (f7 == null) {
            return null;
        }
        boolean z11 = f7.p() && Intrinsics.d(f7.k(), z.b.f91564a);
        List<u> b11 = itemVO.b();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            g c11 = ((u) it.next()).c();
            ru.ozon.android.messenger.blocks.messagetext.f fVar = c11 instanceof ru.ozon.android.messenger.blocks.messagetext.f ? (ru.ozon.android.messenger.blocks.messagetext.f) c11 : null;
            if (fVar != null) {
                arrayList2.add(fVar);
            }
        }
        boolean isEmpty = arrayList2.isEmpty();
        boolean z12 = f7.g() != null;
        Context context = this.f90813a;
        if (isEmpty) {
            r18 = 0;
        } else {
            Iterator it2 = arrayList2.iterator();
            String str = "";
            int i11 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                Spannable d11 = ((ru.ozon.android.messenger.blocks.messagetext.f) next).d();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) str);
                sb2.append((Object) d11);
                String sb3 = sb2.toString();
                if (i11 != arrayList2.size() - 1) {
                    sb3 = ((Object) sb3) + "\n";
                }
                str = sb3;
                i11 = i12;
            }
            r18 = 0;
            OzonSpannableString ozonSpannableString = new OzonSpannableString(ru.ozon.android.messenger.utils.c.d(R$string.messenger_copy_text, context));
            boolean z13 = z11 || z12;
            AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
            String a14 = ru.ozon.android.messenger.framework.navigation.action.d.COPY_MESSAGE.a();
            Tc.d builder = new Tc.d();
            builder.put(d.c.COPY_MESSAGE.a(), str);
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            a13 = e.a(ozonSpannableString, "ic_m_copy_filled", new AtomActionDTO(behavior, null, a14, builder.u(), 2, null), z13, (r12 & 16) != 0 ? "textPrimary" : "textNegative", (r12 & 32) != 0 ? "graphicTertiary" : "graphicNegativePrimary", null);
            arrayList.add(a13);
        }
        if (z11) {
            OzonSpannableString ozonSpannableString2 = new OzonSpannableString(ru.ozon.android.messenger.utils.c.d(R$string.messenger_resend, context));
            AtomActionDTO.Behavior behavior2 = AtomActionDTO.Behavior.CUSTOM;
            String a15 = ru.ozon.android.messenger.framework.navigation.action.d.RESEND_UNDELIVERED_MESSAGE.a();
            Tc.d builder2 = new Tc.d();
            builder2.put(d.c.RETRY_MESSAGE.a(), r.d(itemVO));
            Unit unit2 = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder2, "builder");
            a11 = e.a(ozonSpannableString2, "ic_m_reload_filled", new AtomActionDTO(behavior2, null, a15, builder2.u(), 2, null), true, (r12 & 16) != 0 ? "textPrimary" : "textNegative", (r12 & 32) != 0 ? "graphicTertiary" : "graphicNegativePrimary", null);
            arrayList.add(a11);
            OzonSpannableString ozonSpannableString3 = new OzonSpannableString(ru.ozon.android.messenger.utils.c.d(R$string.messenger_remove, context));
            String a16 = ru.ozon.android.messenger.framework.navigation.action.d.REMOVE_MESSAGE.a();
            Tc.d builder3 = new Tc.d();
            builder3.put(d.c.REMOVE_MESSAGE.a(), f7.getId());
            Intrinsics.checkNotNullParameter(builder3, "builder");
            a12 = e.a(ozonSpannableString3, "ic_m_trash_bin_filled", new AtomActionDTO(behavior2, null, a16, builder3.u(), 2, null), z12, (r12 & 16) != 0 ? "textPrimary" : "textNegative", (r12 & 32) != 0 ? "graphicTertiary" : "graphicNegativePrimary", null);
            arrayList.add(a12);
        }
        if (z12) {
            ContextMenuDTO g10 = f7.g();
            List<ContextMenuDTO.ContextMenuItem> additionalMenuItems = g10 != null ? g10.getAdditionalMenuItems() : r18;
            if (additionalMenuItems != null) {
                int i13 = 0;
                for (Object obj : additionalMenuItems) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw r18;
                    }
                    ContextMenuDTO.ContextMenuItem contextMenuItem = (ContextMenuDTO.ContextMenuItem) obj;
                    OzonSpannableString text = contextMenuItem.getTitle().getText();
                    String textColor = contextMenuItem.getTitle().getTextColor();
                    if (textColor == null) {
                        textColor = "textPrimary";
                    }
                    String str2 = textColor;
                    String icon = contextMenuItem.getIcon().getIcon();
                    String tintColor = contextMenuItem.getIcon().getTintColor();
                    if (tintColor == null) {
                        tintColor = "graphicTertiary";
                    }
                    arrayList.add(e.a(text, icon, contextMenuItem.getAction(), i13 != C7714v.P(additionalMenuItems), str2, tintColor, contextMenuItem.getTrackingInfo()));
                    i13 = i14;
                }
            }
        }
        return arrayList.isEmpty() ? r18 : arrayList;
    }
}
