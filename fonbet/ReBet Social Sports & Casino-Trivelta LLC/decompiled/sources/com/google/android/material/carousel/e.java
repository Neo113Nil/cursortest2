package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f35107a;

    public class a extends e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f35108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f35108b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.e
        public int d() {
            return this.f35108b.m0();
        }

        @Override // com.google.android.material.carousel.e
        public int e() {
            return this.f35108b.getPaddingLeft();
        }

        @Override // com.google.android.material.carousel.e
        public int f() {
            return this.f35108b.z0() - this.f35108b.getPaddingRight();
        }

        @Override // com.google.android.material.carousel.e
        public int g() {
            return h();
        }

        @Override // com.google.android.material.carousel.e
        public int h() {
            return 0;
        }

        @Override // com.google.android.material.carousel.e
        public void i(View view, int i10, int i11) {
            int e10 = e();
            this.f35108b.M0(view, e10, i10, e10 + k(view), i11);
        }

        @Override // com.google.android.material.carousel.e
        public void j(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        public int k(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f35108b.i0(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }
    }

    public class b extends e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f35109b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f35109b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.e
        public int d() {
            return this.f35109b.m0() - this.f35109b.getPaddingBottom();
        }

        @Override // com.google.android.material.carousel.e
        public int e() {
            return 0;
        }

        @Override // com.google.android.material.carousel.e
        public int f() {
            return this.f35109b.z0();
        }

        @Override // com.google.android.material.carousel.e
        public int g() {
            return this.f35109b.P2() ? f() : e();
        }

        @Override // com.google.android.material.carousel.e
        public int h() {
            return this.f35109b.getPaddingTop();
        }

        @Override // com.google.android.material.carousel.e
        public void i(View view, int i10, int i11) {
            int h10 = h();
            this.f35109b.M0(view, i10, h10, i11, h10 + k(view));
        }

        @Override // com.google.android.material.carousel.e
        public void j(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        public int k(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f35109b.h0(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
    }

    public /* synthetic */ e(int i10, a aVar) {
        this(i10);
    }

    public static e a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    public static e b(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return a(carouselLayoutManager);
        }
        if (i10 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static e c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract void i(View view, int i10, int i11);

    public abstract void j(View view, Rect rect, float f10, float f11);

    public e(int i10) {
        this.f35107a = i10;
    }
}
