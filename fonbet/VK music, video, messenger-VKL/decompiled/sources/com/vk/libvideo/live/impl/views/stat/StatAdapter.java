package com.vk.libvideo.live.impl.views.stat;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.dp0;
import xsna.enj;
import xsna.iah0;
import xsna.msk0;
import xsna.oq;
import xsna.ork0;
import xsna.qhp0;
import xsna.rtx;
import xsna.s3q0;
import xsna.tlo0;
import xsna.wzs;
import xsna.zrp;

/* compiled from: StatAdapter.kt */
/* loaded from: classes3.dex */
public final class StatAdapter extends RecyclerView.Adapter<RecyclerView.e0> {
    public final com.vk.libvideo.live.impl.views.stat.a c;
    public final ArrayList<a> d = new ArrayList<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StatAdapter.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ACTION_LINK;
        public static final Type DELIMITER;
        public static final Type EMPTY;
        public static final Type MORE;
        public static final Type STAT;
        public static final Type TITLE;
        public static final Type USER;

        static {
            Type type = new Type(NativeAdContent.ViewTag.AD_TITLE, 0);
            TITLE = type;
            Type type2 = new Type("STAT", 1);
            STAT = type2;
            Type type3 = new Type("USER", 2);
            USER = type3;
            Type type4 = new Type("MORE", 3);
            MORE = type4;
            Type type5 = new Type("DELIMITER", 4);
            DELIMITER = type5;
            Type type6 = new Type("EMPTY", 5);
            EMPTY = type6;
            Type type7 = new Type("ACTION_LINK", 6);
            ACTION_LINK = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: StatAdapter.kt */
    public static final class a {
        public final Type a;
        public final UserProfile b;
        public final String c;
        public final int d;
        public String e;
        public final int f;
        public final ActionLink g;
        public boolean h;

        public a(Type type, UserProfile userProfile, String str, int i, int i2, ActionLink actionLink, int i3) {
            userProfile = (i3 & 2) != 0 ? null : userProfile;
            str = (i3 & 4) != 0 ? null : str;
            i = (i3 & 8) != 0 ? 0 : i;
            i2 = (i3 & 32) != 0 ? 0 : i2;
            actionLink = (i3 & 64) != 0 ? null : actionLink;
            this.a = type;
            this.b = userProfile;
            this.c = str;
            this.d = i;
            this.e = null;
            this.f = i2;
            this.g = actionLink;
            this.h = false;
        }
    }

    /* compiled from: StatAdapter.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.STAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.DELIMITER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.ACTION_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Type.MORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Type.EMPTY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: StatAdapter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements wzs<UserProfile, Integer, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(UserProfile userProfile, Integer num) {
            int intValue = num.intValue();
            ((ork0) this.receiver).n1(userProfile, intValue);
            return s3q0.a;
        }
    }

    /* compiled from: StatAdapter.kt */
    public static final class d extends RecyclerView.e0 {
    }

    /* compiled from: StatAdapter.kt */
    public static final class e extends RecyclerView.e0 {
    }

    /* compiled from: StatAdapter.kt */
    public static final class f extends RecyclerView.e0 {
    }

    /* compiled from: StatAdapter.kt */
    public static final class g extends RecyclerView.e0 {
    }

    /* compiled from: StatAdapter.kt */
    public static final class h extends RecyclerView.e0 {
    }

    public StatAdapter(com.vk.libvideo.live.impl.views.stat.a aVar) {
        this.c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.d.get(i).a.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(e0Var, i, list);
        } else {
            onBindViewHolder(e0Var, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 6;
        AttributeSet attributeSet = null;
        switch (b.$EnumSwitchMapping$0[Type.values()[i].ordinal()]) {
            case 1:
                VkGroupHeader vkGroupHeader = new VkGroupHeader(viewGroup.getContext(), null, 6);
                vkGroupHeader.setSize(VkGroupHeader.Size.Small);
                return new d(vkGroupHeader);
            case 2:
                VkCell vkCell = new VkCell(viewGroup.getContext(), attributeSet, i2, 0);
                vkCell.setLayoutParams(new RecyclerView.p(-1, -2));
                return new e(vkCell);
            case 3:
                View view = new View(viewGroup.getContext());
                view.setLayoutParams(new RecyclerView.p(-1, iah0.a(8.0f)));
                return new f(view);
            case 4:
                return qhp0.a().b(viewGroup);
            case 5:
                rtx i3 = qhp0.a().i(viewGroup.getContext());
                i3.setLayoutParams(new RecyclerView.p(-1, -2));
                return new g(i3);
            case 6:
            case 7:
                msk0 msk0Var = new msk0(viewGroup.getContext());
                msk0Var.setLayoutParams(new RecyclerView.p(-2, -2));
                return new h(msk0Var);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        a aVar = this.d.get(i);
        String str = aVar.c;
        int i2 = aVar.d;
        int i3 = b.$EnumSwitchMapping$0[aVar.a.ordinal()];
        if (i3 == 1) {
            VkGroupHeader vkGroupHeader = (VkGroupHeader) e0Var.itemView;
            tlo0.a aVar2 = tlo0.Companion;
            if (str == null) {
                str = "";
            }
            vkGroupHeader.setTitle(new VkGroupHeader.d(oq.d(aVar2, str), null, null, null, 0, 510));
            return;
        }
        if (i3 != 2) {
            if (i3 == 4) {
                qhp0.a().e(e0Var, aVar.b, aVar.h, new c(2, this.c, ork0.class, "addFriend", "addFriend(Lcom/vk/dto/user/UserProfile;I)V", 0));
                return;
            }
            if (i3 == 5) {
                ActionLink actionLink = aVar.g;
                if (actionLink != null) {
                    qhp0.a().j(e0Var.itemView, actionLink, aVar.d, aVar.f, new dp0(20, e0Var, actionLink));
                    return;
                }
                return;
            }
            if (i3 == 6) {
                ((msk0) e0Var.itemView).getTitle().setText(enj.f(R.plurals.live_viewers_more_users, i2, e0Var.itemView.getContext()));
                return;
            } else {
                if (i3 != 7) {
                    return;
                }
                ((msk0) e0Var.itemView).getTitle().setText(e0Var.itemView.getContext().getString(R.string.live_viewers_no_users));
                return;
            }
        }
        VkCell vkCell = (VkCell) e0Var.itemView;
        tlo0.a aVar3 = tlo0.Companion;
        if (str == null) {
            str = "";
        }
        VkCell.Middle.d dVar = null;
        VkCell.Middle.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(aVar3, str), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, cVar, (VkCell.Middle.Size) objArr, 14));
        String str2 = aVar.e;
        if (str2 == null) {
            str2 = String.valueOf(i2);
        }
        tlo0.h hVar = new tlo0.h(str2);
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.e(hVar, hVar), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
    }
}
