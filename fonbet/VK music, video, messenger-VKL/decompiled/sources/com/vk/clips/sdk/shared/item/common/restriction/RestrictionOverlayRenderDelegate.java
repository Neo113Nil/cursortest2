package com.vk.clips.sdk.shared.item.common.restriction;

import android.util.Size;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.shared.item.common.restriction.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e3m;
import xsna.gzs;
import xsna.izs;
import xsna.oq;
import xsna.s3q0;
import xsna.sy50;
import xsna.tlo0;
import xsna.vlw;
import xsna.x7g;
import xsna.zrp;

/* compiled from: RestrictionOverlayRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class RestrictionOverlayRenderDelegate {
    public final VkPlaceholder a;
    public final izs<RestrictionOverlayAction, s3q0> b;
    public b.e c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RestrictionOverlayRenderDelegate.kt */
    public static final class RestrictionOverlayAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RestrictionOverlayAction[] $VALUES;
        public static final RestrictionOverlayAction ButtonClick;

        static {
            RestrictionOverlayAction restrictionOverlayAction = new RestrictionOverlayAction("ButtonClick", 0);
            ButtonClick = restrictionOverlayAction;
            RestrictionOverlayAction[] restrictionOverlayActionArr = {restrictionOverlayAction};
            $VALUES = restrictionOverlayActionArr;
            $ENTRIES = new asp(restrictionOverlayActionArr);
        }

        public RestrictionOverlayAction() {
            throw null;
        }

        public static RestrictionOverlayAction valueOf(String str) {
            return (RestrictionOverlayAction) Enum.valueOf(RestrictionOverlayAction.class, str);
        }

        public static RestrictionOverlayAction[] values() {
            return (RestrictionOverlayAction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RestrictionOverlayRenderDelegate(VkPlaceholder vkPlaceholder, izs<? super RestrictionOverlayAction, s3q0> izsVar) {
        this.a = vkPlaceholder;
        this.b = izsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b bVar) {
        VkPlaceholder.c.C0860c c0860c;
        b.d dVar;
        VkPlaceholder.b bVar2;
        b.a aVar;
        String str;
        if ((bVar instanceof b.e) && !bVar.equals(this.c)) {
            b.e eVar = (b.e) bVar;
            b.c cVar = eVar.b;
            boolean z = cVar instanceof b.c.C0674b;
            VkPlaceholder vkPlaceholder = this.a;
            VkPlaceholder.a.b bVar3 = null;
            if (z) {
                int a = e3m.a(R.dimen.clip_restriction_overlay_icon_size, vkPlaceholder.getContext());
                ImageUrl b = ((b.c.C0674b) cVar).a.b(a);
                if (b != null && (str = b.b) != null) {
                    c0860c = new VkPlaceholder.c.C0860c(new vlw(str, null), new Size(a, a), new x7g(R.attr.vk_ui_icon_contrast), null, 24);
                    vkPlaceholder.setTop(c0860c);
                    dVar = eVar.c;
                    if (!(dVar instanceof b.d.C0675b)) {
                        bVar2 = new VkPlaceholder.b(new VkPlaceholder.b.c(2, oq.d(tlo0.Companion, ((b.d.C0675b) dVar).a)), null, 2);
                    } else {
                        if (!(dVar instanceof b.d.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar2 = null;
                    }
                    vkPlaceholder.setMiddle(bVar2);
                    aVar = eVar.d;
                    if (!(aVar instanceof b.a.C0672b)) {
                        bVar3 = new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) oq.d(tlo0.Companion, ((b.a.C0672b) aVar).a), (gzs) new sy50(this, 26), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, VkButton.Mode.Primary, VkButton.Appearance.Overlay, false, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE), null, null, null, 8);
                    } else if (!(aVar instanceof b.a.C0671a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkPlaceholder.setBottom(bVar3);
                    this.c = eVar;
                }
            } else if (!(cVar instanceof b.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c0860c = null;
            vkPlaceholder.setTop(c0860c);
            dVar = eVar.c;
            if (!(dVar instanceof b.d.C0675b)) {
            }
            vkPlaceholder.setMiddle(bVar2);
            aVar = eVar.d;
            if (!(aVar instanceof b.a.C0672b)) {
            }
            vkPlaceholder.setBottom(bVar3);
            this.c = eVar;
        }
    }
}
