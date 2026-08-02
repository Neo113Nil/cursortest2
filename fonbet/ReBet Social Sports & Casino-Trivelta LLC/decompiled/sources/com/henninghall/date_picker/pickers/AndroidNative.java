package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.henninghall.date_picker.generated.e;
import com.henninghall.date_picker.o;
import com.henninghall.date_picker.pickers.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class AndroidNative extends com.henninghall.date_picker.generated.e implements com.henninghall.date_picker.pickers.a {

    /* renamed from: P4, reason: collision with root package name */
    public a.InterfaceC0537a f38608P4;

    /* renamed from: Q4, reason: collision with root package name */
    public int f38609Q4;

    /* renamed from: R4, reason: collision with root package name */
    public a.b f38610R4;

    /* renamed from: S4, reason: collision with root package name */
    public boolean f38611S4;

    /* renamed from: T4, reason: collision with root package name */
    public final Handler f38612T4;

    /* renamed from: U4, reason: collision with root package name */
    public boolean f38613U4;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f38611S4 = false;
            AndroidNative.this.f38608P4.b();
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AndroidNative f38615a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f38616b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f38617c;

        public b(AndroidNative androidNative, boolean z10, boolean z11) {
            this.f38615a = androidNative;
            this.f38616b = z10;
            this.f38617c = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.p0(this.f38615a, this.f38616b);
            if (this.f38617c) {
                AndroidNative.this.s0();
            }
        }
    }

    public class c implements e.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.henninghall.date_picker.pickers.a f38619a;

        public c(com.henninghall.date_picker.pickers.a aVar) {
            this.f38619a = aVar;
        }

        @Override // com.henninghall.date_picker.generated.e.j
        public void a(com.henninghall.date_picker.generated.e eVar, int i10, int i11) {
            if (AndroidNative.this.f38610R4 != null) {
                AndroidNative.this.f38610R4.a(this.f38619a, i10, i11);
            }
            if (AndroidNative.this.f38609Q4 == 0) {
                AndroidNative.this.s0();
            }
        }
    }

    public class d implements e.i {
        public d() {
        }

        @Override // com.henninghall.date_picker.generated.e.i
        public void a(com.henninghall.date_picker.generated.e eVar, int i10) {
            AndroidNative.this.r0(i10);
            AndroidNative.this.f38609Q4 = i10;
            if (i10 != 0) {
                AndroidNative.this.f38613U4 = true;
                AndroidNative.this.f38608P4.b();
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f38613U4 = false;
            AndroidNative.this.f38608P4.a();
            AndroidNative.this.f38608P4.b();
        }
    }

    public AndroidNative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38609Q4 = 0;
        this.f38612T4 = new Handler();
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void a(int i10, boolean z10) {
        b(i10);
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void b(int i10) {
        int value = getValue();
        if (i10 == value) {
            return;
        }
        int e10 = o.e(value, i10, getMaxValue(), getWrapSelectorWheel());
        int abs = Math.abs(e10);
        this.f38611S4 = true;
        this.f38608P4.b();
        this.f38612T4.postDelayed(new a(), abs * 100);
        int i11 = 0;
        while (i11 < abs) {
            q0(e10 > 0, i11 * 100, i11 == abs + (-1));
            i11++;
        }
    }

    @Override // com.henninghall.date_picker.pickers.a
    public boolean c() {
        return this.f38613U4 || this.f38611S4;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public View getView() {
        return this;
    }

    @Override // com.henninghall.date_picker.generated.e, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38612T4.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r7 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        setValue((r6 + r1) % getMaxValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r7 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r7 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (r7 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0(com.henninghall.date_picker.generated.e eVar, boolean z10) {
        int value;
        try {
            try {
                try {
                    try {
                        Method declaredMethod = getClass().getSuperclass().getDeclaredMethod("changeValueByOne", Boolean.TYPE);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(eVar, Boolean.valueOf(z10));
                    } catch (InvocationTargetException e10) {
                        Log.w("changeValueByOne", e10);
                        value = getValue();
                    }
                } catch (IllegalAccessException e11) {
                    Log.w("changeValueByOne", e11);
                    value = getValue();
                }
            } catch (IllegalArgumentException e12) {
                Log.w("changeValueByOne", e12);
                value = getValue();
            } catch (NoSuchMethodException e13) {
                Log.w("changeValueByOne", e13);
                value = getValue();
            }
        } catch (Throwable th2) {
            setValue((getValue() + (z10 ? 1 : -1)) % getMaxValue());
            throw th2;
        }
    }

    public final void q0(boolean z10, int i10, boolean z11) {
        this.f38612T4.postDelayed(new b(this, z10, z11), i10);
    }

    public final void r0(int i10) {
        if (this.f38609Q4 == 0 || i10 != 0) {
            return;
        }
        s0();
    }

    public final void s0() {
        this.f38612T4.postDelayed(new e(), 500L);
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setDividerColor(String str) {
        super.setDividerTint(Color.parseColor(str));
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangeListenerInScrolling(a.b bVar) {
        this.f38610R4 = bVar;
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setOnValueChangedListener(a.InterfaceC0537a interfaceC0537a) {
        this.f38608P4 = interfaceC0537a;
        super.setOnValueChangedListener(new c(this));
        super.setOnScrollListener(new d());
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setTextAlign(Paint.Align align) {
    }

    @Override // com.henninghall.date_picker.pickers.a
    public void setTextColor(String str) {
        int parseColor = Color.parseColor(str);
        if (Build.VERSION.SDK_INT >= 29) {
            super.setTextColor(parseColor);
            return;
        }
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("mSelectorWheelPaint");
            declaredField.setAccessible(true);
            ((Paint) declaredField.get(this)).setColor(parseColor);
        } catch (IllegalAccessException e10) {
            Log.w("setSelectedTextColor", e10);
        } catch (IllegalArgumentException e11) {
            Log.w("setSelectedTextColor", e11);
        } catch (NoSuchFieldException e12) {
            Log.w("setSelectedTextColor", e12);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setTextColor(parseColor);
            }
        }
        invalidate();
    }
}
