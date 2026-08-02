package com.vk.voip.ui.hint;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.movika.sdk.base.ui.r;
import com.vkontakte.android.R;
import defpackage.q0;
import xsna.epx;
import xsna.f4m;
import xsna.fnj;
import xsna.gzs;
import xsna.iah0;
import xsna.s3q0;
import xsna.vr6;

/* compiled from: VoipHintView.kt */
/* loaded from: classes7.dex */
public final class VoipHintView extends LinearLayout {
    public static final /* synthetic */ int g = 0;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final int e;
    public a f;

    /* compiled from: VoipHintView.kt */
    public static final class a {
        public final String a;
        public final Integer b;
        public final String c;
        public final gzs<s3q0> d;
        public final boolean e;

        public /* synthetic */ a(String str, Integer num, String str2, r rVar, boolean z, int i) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : rVar, (i & 16) != 0 ? true : z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            gzs<s3q0> gzsVar = this.d;
            return Boolean.hashCode(this.e) + ((hashCode3 + (gzsVar != null ? gzsVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(hintText=");
            sb.append(this.a);
            sb.append(", iconRes=");
            sb.append(this.b);
            sb.append(", buttonText=");
            sb.append(this.c);
            sb.append(", buttonOnClickListener=");
            sb.append(this.d);
            sb.append(", shouldWrapContentInWidth=");
            return q0.a(sb, this.e, ')');
        }

        public a(String str, Integer num, String str2, gzs<s3q0> gzsVar, boolean z) {
            this.a = str;
            this.b = num;
            this.c = str2;
            this.d = gzsVar;
            this.e = z;
        }
    }

    public VoipHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setBackgroundResource(R.drawable.voip_hint_background);
        float f = 16;
        f4m.x(iah0.a(f), this);
        f4m.w(iah0.a(f), this);
        LayoutInflater.from(context).inflate(R.layout.voip_hint_view, this);
        this.b = (ImageView) findViewById(R.id.voip_hint_image_view);
        this.c = (TextView) findViewById(R.id.voip_hint_text_view);
        this.d = (TextView) findViewById(R.id.voip_hint_button_view);
        this.e = fnj.d(context) ? iah0.a(320) : -1;
    }

    public final void a(a aVar) {
        String str = aVar.c;
        Integer num = aVar.b;
        if (aVar.equals(this.f)) {
            return;
        }
        ImageView imageView = this.b;
        if (num == null) {
            f4m.j(imageView);
        } else {
            imageView.setImageResource(num.intValue());
            imageView.setVisibility(0);
        }
        String str2 = aVar.a;
        TextView textView = this.c;
        textView.setText(str2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        if (num != null && str != null) {
            marginLayoutParams.topMargin = iah0.a(2);
            marginLayoutParams.bottomMargin = iah0.a(12);
        } else if (num == null && str == null) {
            float f = 12;
            marginLayoutParams.topMargin = iah0.a(f);
            marginLayoutParams.bottomMargin = iah0.a(f);
        } else if (num != null && str == null) {
            marginLayoutParams.topMargin = iah0.a(2);
            marginLayoutParams.bottomMargin = iah0.a(16);
        } else if (num == null && str != null) {
            marginLayoutParams.topMargin = iah0.a(16);
            marginLayoutParams.bottomMargin = iah0.a(12);
        }
        textView.setLayoutParams(marginLayoutParams);
        TextView textView2 = this.d;
        if (str == null) {
            f4m.j(textView2);
            textView2.setOnClickListener(null);
        } else {
            textView2.setText(str);
            textView2.setOnClickListener(new vr6(aVar, 11));
            textView2.setVisibility(0);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = aVar.e ? -2 : this.e;
        layoutParams.height = -2;
        setLayoutParams(layoutParams);
        this.f = aVar;
    }
}
