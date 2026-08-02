package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C5305a;
import androidx.core.view.Y;
import y2.q;

/* loaded from: classes9.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f58422d = {R.attr.state_checked};

    /* renamed from: a, reason: collision with root package name */
    private boolean f58423a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f58424b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f58425c;

    final class a extends C5305a {
        a() {
        }

        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull q qVar) {
            super.onInitializeAccessibilityNodeInfo(view, qVar);
            CheckableImageButton checkableImageButton = CheckableImageButton.this;
            qVar.I(checkableImageButton.a());
            qVar.J(checkableImageButton.isChecked());
        }
    }

    static class b extends O2.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        boolean f58427c;

        final class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i11) {
                return new b[i11];
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f58427c ? 1 : 0);
        }

        public b(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f58427c = parcel.readInt() == 1;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ru.ozon.app.android.R.attr.imageButtonStyle);
        this.f58424b = true;
        this.f58425c = true;
        Y.C(this, new a());
    }

    public final boolean a() {
        return this.f58424b;
    }

    public final void b(boolean z11) {
        if (this.f58424b != z11) {
            this.f58424b = z11;
            sendAccessibilityEvent(0);
        }
    }

    public final void c(boolean z11) {
        this.f58425c = z11;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f58423a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i11) {
        return this.f58423a ? View.mergeDrawableStates(super.onCreateDrawableState(i11 + 1), f58422d) : super.onCreateDrawableState(i11);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f58427c);
    }

    @Override // android.view.View
    @NonNull
    protected final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f58427c = this.f58423a;
        return bVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z11) {
        if (!this.f58424b || this.f58423a == z11) {
            return;
        }
        this.f58423a = z11;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setPressed(boolean z11) {
        if (this.f58425c) {
            super.setPressed(z11);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f58423a);
    }
}
