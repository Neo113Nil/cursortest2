package com.vk.camera.clips.impl.authors.selector.list.delegate;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import defpackage.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.bwt0;
import xsna.dhr0;
import xsna.epx;
import xsna.ge0;
import xsna.ghd;
import xsna.hfz;
import xsna.hhd;
import xsna.ho8;
import xsna.izs;
import xsna.jjd;
import xsna.msy;
import xsna.oq;
import xsna.p1u0;
import xsna.qf9;
import xsna.s3q0;
import xsna.tlo0;
import xsna.ul1;
import xsna.vfz;
import xsna.zrp;

/* compiled from: ClipsAuthorSelectorAuthorDelegate.kt */
/* loaded from: classes14.dex */
public final class ClipsAuthorSelectorAuthorDelegate extends p1u0<hhd> {
    public final ul1 a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsAuthorSelectorAuthorDelegate.kt */
    public static final class Payload {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload SELECTION_CHANGED;

        static {
            Payload payload = new Payload("SELECTION_CHANGED", 0);
            SELECTION_CHANGED = payload;
            Payload[] payloadArr = {payload};
            $VALUES = payloadArr;
            $ENTRIES = new asp(payloadArr);
        }

        public Payload() {
            throw null;
        }

        public static Payload valueOf(String str) {
            return (Payload) Enum.valueOf(Payload.class, str);
        }

        public static Payload[] values() {
            return (Payload[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsAuthorSelectorAuthorDelegate.kt */
    public static final class a extends vfz<hhd> {
        public final izs<ghd, s3q0> l;
        public final Object m;

        /* compiled from: ClipsAuthorSelectorAuthorDelegate.kt */
        /* renamed from: com.vk.camera.clips.impl.authors.selector.list.delegate.ClipsAuthorSelectorAuthorDelegate$a$a, reason: collision with other inner class name */
        public static final class C0438a implements VkCell.e {
            @Override // com.vk.core.view.components.cell.VkCell.e
            public final VkCell.d create(Context context) {
                return new b(context);
            }
        }

        /* compiled from: ClipsAuthorSelectorAuthorDelegate.kt */
        public static final class b implements VkCell.d {
            public final VkAvatar a;

            public b(Context context) {
                VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
                vkAvatar.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, context));
                this.a = vkAvatar;
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final void a(VkCell.f fVar) {
                c cVar = fVar instanceof c ? (c) fVar : null;
                if (cVar != null) {
                    this.a.o0(cVar.a, null);
                }
            }

            @Override // com.vk.core.view.components.cell.VkCell.d
            public final View getView() {
                return this.a;
            }
        }

        /* compiled from: ClipsAuthorSelectorAuthorDelegate.kt */
        public static final class c implements VkCell.f {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("AvatarViewParams(avatarUri="), this.a, ')');
            }
        }

        public a(View view, ul1 ul1Var) {
            super(view);
            this.l = ul1Var;
            this.m = msy.a(LazyThreadSafetyMode.NONE, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(view, 22));
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        public final void W5(hhd hhdVar) {
            hhd hhdVar2 = hhdVar;
            ?? r2 = this.m;
            bwt0.i0((VkCell) r2.getValue(), new b0(8, this, hhdVar2));
            ((VkCell) r2.getValue()).setLeftMainAvatarController(new C0438a());
            VkCell vkCell = (VkCell) r2.getValue();
            ghd ghdVar = hhdVar2.b;
            jjd a = qf9.a(ghdVar.a);
            String str = a != null ? a.a : null;
            if (str == null) {
                str = "";
            }
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.a(new c(str), VkCell.Left.Main.Size.Small), null));
            VkCell vkCell2 = (VkCell) r2.getValue();
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            tlo0.a aVar2 = tlo0.Companion;
            String name = ghdVar.a.getName();
            vkCell2.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(oq.d(aVar2, name != null ? name : ""), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
            h6(hhdVar2);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final void h6(hhd hhdVar) {
            VkCell.Right.d dVar;
            VkCell vkCell = (VkCell) this.m.getValue();
            if (hhdVar.b.b) {
                dVar = new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, new VkCell.Right.ExtraAction.a(4, new ge0(5, this, hhdVar), true), (VkCell.Right.b) null, 27);
            } else {
                dVar = null;
            }
            vkCell.setRight(dVar);
        }
    }

    public ClipsAuthorSelectorAuthorDelegate(ul1 ul1Var) {
        this.a = ul1Var;
    }

    @Override // xsna.p1u0
    public final void a(vfz<hhd> vfzVar, hhd hhdVar, List list) {
        hhd hhdVar2 = hhdVar;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            vfzVar.W5(hhdVar2);
            return;
        }
        a aVar = vfzVar instanceof a ? (a) vfzVar : null;
        if (aVar == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == Payload.SELECTION_CHANGED) {
                aVar.h6(hhdVar2);
            }
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends hhd> b(ViewGroup viewGroup) {
        return new a(bwt0.I(R.layout.clips_authors_selector_list_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof hhd;
    }
}
