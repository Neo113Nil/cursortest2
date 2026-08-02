package com.vk.feed.design.view.newsfeed.ads_mytarget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dhr0;
import xsna.epx;
import xsna.gko;
import xsna.izs;
import xsna.l44;
import xsna.pr;
import xsna.q4m;
import xsna.s3q0;
import xsna.tlo0;
import xsna.uqi;
import xsna.urd0;
import xsna.x7g;
import xsna.zrp;

/* compiled from: MyTargetAdHideReasonsView.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdHideReasonsView extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final VkPlaceholder b;
    public final LinearLayout c;
    public final VkText d;
    public izs<? super String, s3q0> e;
    public izs<? super String[], s3q0> f;
    public final ViewGroup.LayoutParams g;

    /* compiled from: MyTargetAdHideReasonsView.kt */
    public static final class ActionModel {
        public final Type a;
        public final String b;
        public final String c;
        public final Integer d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MyTargetAdHideReasonsView.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type COMPLAIN;
            public static final Type HIDE;
            public static final Type UNKNOWN;

            static {
                Type type = new Type("HIDE", 0);
                HIDE = type;
                Type type2 = new Type("COMPLAIN", 1);
                COMPLAIN = type2;
                Type type3 = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
                UNKNOWN = type3;
                Type[] typeArr = {type, type2, type3};
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

        public ActionModel(Type type, String str, String str2, Integer num) {
            this.a = type;
            this.b = str;
            this.c = str2;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionModel)) {
                return false;
            }
            ActionModel actionModel = (ActionModel) obj;
            return this.a == actionModel.a && epx.f(this.b, actionModel.b) && epx.f(this.c, actionModel.c) && epx.f(this.d, actionModel.d);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            Integer num = this.d;
            return a + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionModel(type=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", alias=");
            sb.append(this.c);
            sb.append(", iconResId=");
            return uqi.b(sb, this.d, ')');
        }
    }

    /* compiled from: MyTargetAdHideReasonsView.kt */
    public static final class a {
        public final tlo0.f a;
        public final Drawable b;

        public a(tlo0.f fVar, Drawable drawable) {
            this.a = fVar;
            this.b = drawable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a.a) * 31;
            Drawable drawable = this.b;
            return hashCode + (drawable == null ? 0 : drawable.hashCode());
        }

        public final String toString() {
            return "CancelButtonModel(text=" + this.a + ", background=" + this.b + ')';
        }
    }

    /* compiled from: MyTargetAdHideReasonsView.kt */
    public static final class b {
        public final tlo0.f a;
        public final tlo0.f b;

        public b(tlo0.f fVar, tlo0.f fVar2) {
            this.a = fVar;
            this.b = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.b.a) + (Integer.hashCode(this.a.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaceholderModel(title=");
            sb.append(this.a);
            sb.append(", description=");
            return pr.b(sb, this.b, ')');
        }
    }

    public MyTargetAdHideReasonsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void setCancelHideReasonsClickListener(izs<? super View, s3q0> izsVar) {
        this.d.setOnClickListener(izsVar != null ? new l44(izsVar, 8) : null);
    }

    public final void setHideReasonsItemClickListener(izs<? super String, s3q0> izsVar) {
        this.e = izsVar;
    }

    public final void setReportClickItemListener(izs<? super String[], s3q0> izsVar) {
        this.f = izsVar;
    }

    public final void setUpCancelButton(a aVar) {
        CharSequence a2 = tlo0.b.a(aVar.a, getContext());
        VkText vkText = this.d;
        vkText.setText(a2);
        vkText.setBackground(aVar.b);
    }

    public final void setUpMenuActions(List<ActionModel> list) {
        LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ActionModel) obj).a == ActionModel.Type.HIDE) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActionModel actionModel = (ActionModel) it.next();
            String str = actionModel.b;
            ColorStateList r = dhr0.r(R.attr.vk_ui_text_primary);
            Integer num = actionModel.d;
            Drawable a2 = num != null ? dhr0.t.a(num.intValue()) : null;
            ColorStateList r2 = dhr0.r(R.attr.vk_ui_icon_secondary);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.feed_news_item_ignored_hide_option, (ViewGroup) linearLayout, false);
            VkText vkText = (VkText) inflate.findViewById(R.id.option_text);
            View findViewById = inflate.findViewById(R.id.option_icon);
            vkText.setText(str);
            vkText.setTextColor(r);
            findViewById.setBackground(a2);
            findViewById.setBackgroundTintList(r2);
            linearLayout.addView(inflate, this.g);
            inflate.setOnClickListener(new q4m(1, this, actionModel));
        }
    }

    public final void setUpPlaceholder(b bVar) {
        VkPlaceholder vkPlaceholder = this.b;
        vkPlaceholder.setWithPaddings(false);
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_check_circle_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, bVar.a), new VkPlaceholder.b.C0859b(14, bVar.b)));
    }

    public MyTargetAdHideReasonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MyTargetAdHideReasonsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MyTargetAdHideReasonsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MyTargetAdHideReasonsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g = new ViewGroup.LayoutParams(-1, -2);
        LayoutInflater.from(context).inflate(R.layout.feed_my_target_ad_hide_reasons_view, (ViewGroup) this, true);
        this.b = (VkPlaceholder) findViewById(R.id.item_ignored_header);
        this.c = (LinearLayout) findViewById(R.id.hide_reasons_container);
        this.d = (VkText) findViewById(R.id.item_ignored_cancel);
    }
}
