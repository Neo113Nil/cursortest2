package com.vk.auth.ui.fastlogin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.auth.client.R$styleable;
import com.vkontakte.android.R;
import xsna.a50;
import xsna.asp;
import xsna.bpn0;
import xsna.f4m;
import xsna.r55;
import xsna.uyq0;
import xsna.ysv0;
import xsna.z00;
import xsna.zrp;

/* compiled from: VkConnectInfoHeader.kt */
/* loaded from: classes15.dex */
public final class VkConnectInfoHeader extends LinearLayout {
    public static final /* synthetic */ int h = 0;
    public final ImageView b;
    public final TextView c;
    public final View d;
    public final View e;
    public final bpn0 f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkConnectInfoHeader.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a LOGO;
        public static final a NONE;
        public static final a TEXT;

        static {
            a aVar = new a("LOGO", 0);
            LOGO = aVar;
            a aVar2 = new a("TEXT", 1);
            TEXT = aVar2;
            a aVar3 = new a("NONE", 2);
            NONE = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public VkConnectInfoHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = new bpn0(new uyq0(this, 8));
        a aVar = a.LOGO;
        setOrientation(1);
        setGravity(17);
        setDescendantFocusability(393216);
        LayoutInflater.from(context).inflate(R.layout.vk_connect_info_header_layout, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.text);
        this.c = textView;
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        this.b = imageView;
        View findViewById = findViewById(R.id.expand_indicator);
        this.d = findViewById;
        this.e = findViewById(R.id.services_text);
        r55 r55Var = r55.a;
        imageView.setImageDrawable(r55.i().b(context));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            this.g = z;
            if (z) {
                f4m.j(imageView);
                f4m.j(textView);
            }
            obtainStyledAttributes.recycle();
            Object i = r55.i();
            ysv0 ysv0Var = i instanceof ysv0 ? (ysv0) i : null;
            if (ysv0Var != null) {
                ysv0Var.a();
            }
            findViewById.setVisibility(8);
            setOnClickListener(new a50(this, 12));
            imageView.setOnClickListener(new z00(this, 12));
            setLogoMode(0);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final TextView getToolbarSubtitleInfo() {
        return (TextView) this.f.getValue();
    }

    public final ImageView getLogo$core_release() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void setLogoMode(int i) {
        a aVar = a.LOGO;
        if (!this.g) {
            this.b.setVisibility(0);
        }
        f4m.j(this.c);
        this.e.setVisibility(i);
    }

    public final void setNoneMode(int i) {
        a aVar = a.LOGO;
        if (!this.g) {
            this.c.setVisibility(4);
            this.b.setVisibility(4);
        }
        this.e.setVisibility(i);
    }

    public final void setTextMode(int i) {
        a aVar = a.LOGO;
        TextView textView = this.c;
        textView.setText(i);
        if (!this.g) {
            textView.setVisibility(0);
        }
        f4m.j(this.b);
        f4m.j(this.e);
    }
}
