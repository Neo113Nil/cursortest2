package com.vk.pin.views.dots;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.vk.superapp.vkpay.pin.R$styleable;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.j5g;
import xsna.r5o;
import xsna.u5o;
import xsna.zrp;

/* compiled from: PinDotsView.kt */
/* loaded from: classes3.dex */
public final class PinDotsView extends LinearLayout {
    public final List<? extends r5o> b;
    public final ArrayList c;
    public final int d;
    public u5o e;
    public int f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PinDotsView.kt */
    public static final class DotState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DotState[] $VALUES;
        public static final DotState Error;
        public static final DotState Filled;
        public static final DotState Idle;
        public static final DotState Success;

        static {
            DotState dotState = new DotState("Idle", 0);
            Idle = dotState;
            DotState dotState2 = new DotState("Filled", 1);
            Filled = dotState2;
            DotState dotState3 = new DotState("Error", 2);
            Error = dotState3;
            DotState dotState4 = new DotState("Success", 3);
            Success = dotState4;
            DotState[] dotStateArr = {dotState, dotState2, dotState3, dotState4};
            $VALUES = dotStateArr;
            $ENTRIES = new asp(dotStateArr);
        }

        public DotState() {
            throw null;
        }

        public static DotState valueOf(String str) {
            return (DotState) Enum.valueOf(DotState.class, str);
        }

        public static DotState[] values() {
            return (DotState[]) $VALUES.clone();
        }
    }

    public PinDotsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new u5o();
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0) : null;
        if (obtainStyledAttributes != null) {
            this.d = obtainStyledAttributes.getInt(2, 4);
            String string = obtainStyledAttributes.getString(3);
            string = string == null ? "" : string;
            if (string.length() > 0) {
                Object newInstance = context.getClassLoader().loadClass(string).newInstance();
                if (!(newInstance instanceof u5o)) {
                    throw new IllegalArgumentException("Factory should extend DotsFactory");
                }
                setDotsFactory((u5o) newInstance);
            }
        }
        ArrayList arrayList = new ArrayList();
        int i3 = this.d;
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(this.e.createDot(getContext()));
        }
        List<? extends r5o> O0 = j5g.O0(arrayList);
        this.b = O0;
        for (r5o r5oVar : O0 != null ? O0 : null) {
            DotState dotState = DotState.Idle;
            r5oVar.b = dotState;
            r5oVar.setBackground(r5oVar.a(dotState));
            r5oVar.c(dotState);
            addView(r5oVar);
        }
        ArrayList arrayList2 = new ArrayList(i3);
        for (int i5 = 0; i5 < i3; i5++) {
            arrayList2.add(DotState.Idle);
        }
        this.c = arrayList2;
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setCurrentCount(int i) {
        int i2 = this.d;
        if (i > i2 || i < 0) {
            d();
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            ArrayList arrayList = null;
            ArrayList arrayList2 = this.c;
            if (arrayList2 == null) {
                arrayList2 = null;
            }
            arrayList2.set(i3, i3 < i ? DotState.Filled : DotState.Idle);
            List<? extends r5o> list = this.b;
            if (list == null) {
                list = null;
            }
            r5o r5oVar = list.get(i3);
            ArrayList arrayList3 = this.c;
            if (arrayList3 != null) {
                arrayList = arrayList3;
            }
            DotState dotState = (DotState) arrayList.get(i3);
            r5oVar.b = dotState;
            r5oVar.setBackground(r5oVar.a(dotState));
            r5oVar.c(dotState);
            i3++;
        }
    }

    private final void setDotsFactory(u5o u5oVar) {
        this.e = u5oVar;
    }

    public final void a() {
        this.f = 0;
        setCurrentCount(0);
    }

    public final void b() {
        int i = this.f;
        if (i - 1 < 0) {
            a();
            return;
        }
        int i2 = i - 1;
        this.f = i2;
        setCurrentCount(i2);
    }

    public final void c() {
        int i = this.f;
        if (i + 1 > this.d) {
            return;
        }
        int i2 = i + 1;
        this.f = i2;
        setCurrentCount(i2);
    }

    public final void d() {
        List<? extends r5o> list = this.b;
        if (list == null) {
            list = null;
        }
        for (r5o r5oVar : list) {
            DotState dotState = DotState.Error;
            r5oVar.b = dotState;
            r5oVar.setBackground(r5oVar.a(dotState));
            r5oVar.c(dotState);
        }
    }

    public PinDotsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PinDotsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinDotsView(Context context) {
        this(context, null);
    }
}
