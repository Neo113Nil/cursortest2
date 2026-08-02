package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;
import java.util.List;

/* loaded from: classes.dex */
public class s implements com.airbnb.lottie.model.content.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28827a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.b f28828b;

    /* renamed from: c, reason: collision with root package name */
    public final List f28829c;

    /* renamed from: d, reason: collision with root package name */
    public final F3.a f28830d;

    /* renamed from: e, reason: collision with root package name */
    public final F3.d f28831e;

    /* renamed from: f, reason: collision with root package name */
    public final F3.b f28832f;

    /* renamed from: g, reason: collision with root package name */
    public final b f28833g;

    /* renamed from: h, reason: collision with root package name */
    public final c f28834h;

    /* renamed from: i, reason: collision with root package name */
    public final float f28835i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f28836j;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType;
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType;

        static {
            int[] iArr = new int[c.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int i10 = a.$SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType[ordinal()];
            return i10 != 1 ? i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int i10 = a.$SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public s(String str, F3.b bVar, List list, F3.a aVar, F3.d dVar, F3.b bVar2, b bVar3, c cVar, float f10, boolean z10) {
        this.f28827a = str;
        this.f28828b = bVar;
        this.f28829c = list;
        this.f28830d = aVar;
        this.f28831e = dVar;
        this.f28832f = bVar2;
        this.f28833g = bVar3;
        this.f28834h = cVar;
        this.f28835i = f10;
        this.f28836j = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.t(k10, bVar, this);
    }

    public b b() {
        return this.f28833g;
    }

    public F3.a c() {
        return this.f28830d;
    }

    public F3.b d() {
        return this.f28828b;
    }

    public c e() {
        return this.f28834h;
    }

    public List f() {
        return this.f28829c;
    }

    public float g() {
        return this.f28835i;
    }

    public String h() {
        return this.f28827a;
    }

    public F3.d i() {
        return this.f28831e;
    }

    public F3.b j() {
        return this.f28832f;
    }

    public boolean k() {
        return this.f28836j;
    }
}
