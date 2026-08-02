package V8;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.giphy.sdk.ui.GPHContentType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;

/* renamed from: V8.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1743y extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    public Function1 f12805A;

    /* renamed from: B, reason: collision with root package name */
    public Function2 f12806B;

    /* renamed from: C, reason: collision with root package name */
    public GPHContentType f12807C;

    /* renamed from: D, reason: collision with root package name */
    public a f12808D;

    /* renamed from: E, reason: collision with root package name */
    public androidx.constraintlayout.widget.d f12809E;

    /* renamed from: F, reason: collision with root package name */
    public androidx.constraintlayout.widget.d f12810F;

    /* renamed from: G, reason: collision with root package name */
    public androidx.constraintlayout.widget.d f12811G;

    /* renamed from: H, reason: collision with root package name */
    public androidx.constraintlayout.widget.d f12812H;

    /* renamed from: z, reason: collision with root package name */
    public final S8.e f12813z;

    /* renamed from: V8.y$a */
    public enum a {
        Browse,
        SearchFocus,
        SearchResults
    }

    /* renamed from: V8.y$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GPHContentType.values().length];
            try {
                iArr[GPHContentType.clips.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GPHContentType.gif.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GPHContentType.sticker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GPHContentType.text.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GPHContentType.emoji.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GPHContentType.recents.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: V8.y$c */
    public static final class c extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f12817d = new c();

        public c() {
            super(2);
        }

        public final void a(a aVar, a aVar2) {
            Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(aVar2, "<anonymous parameter 1>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((a) obj, (a) obj2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: V8.y$d */
    public static final class d extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f12818d = new d();

        public d() {
            super(1);
        }

        public final void a(GPHContentType it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GPHContentType) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743y(Context context, S8.e theme, GPHContentType[] mediaConfigs) {
        super(context);
        GPHContentType gPHContentType;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(mediaConfigs, "mediaConfigs");
        this.f12813z = theme;
        this.f12805A = d.f12818d;
        this.f12806B = c.f12817d;
        this.f12807C = GPHContentType.gif;
        this.f12808D = a.Browse;
        this.f12810F = new androidx.constraintlayout.widget.d();
        this.f12811G = new androidx.constraintlayout.widget.d();
        this.f12812H = new androidx.constraintlayout.widget.d();
        LayoutInflater.from(context).inflate(O8.t.f8535f, (ViewGroup) this, true);
        int length = mediaConfigs.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                gPHContentType = null;
                break;
            }
            gPHContentType = mediaConfigs[i11];
            if (gPHContentType == GPHContentType.recents && !O8.k.f8390a.g().c().isEmpty()) {
                break;
            } else {
                i11++;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (GPHContentType gPHContentType2 : mediaConfigs) {
            if (gPHContentType2 != GPHContentType.recents) {
                arrayList.add(gPHContentType2);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (gPHContentType != null) {
            mutableList.add(0, gPHContentType);
        }
        if (O8.k.f8390a.i() == null) {
            mutableList.remove(GPHContentType.clips);
        }
        GPHContentType[] gPHContentTypeArr = (GPHContentType[]) mutableList.toArray(new GPHContentType[0]);
        ArrayList arrayList2 = new ArrayList();
        for (GPHContentType gPHContentType3 : gPHContentTypeArr) {
            View inflate = LayoutInflater.from(context).inflate(O8.t.f8534e, (ViewGroup) this, false);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.widget.ImageButton");
            ImageButton imageButton = (ImageButton) inflate;
            imageButton.setTag(gPHContentType3);
            switch (b.$EnumSwitchMapping$0[gPHContentType3.ordinal()]) {
                case 1:
                    imageButton.setId(O8.s.f8471T);
                    imageButton.setImageDrawable(AbstractC5338c.getDrawable(context, O8.r.f8418f));
                    imageButton.setContentDescription(context.getString(O8.u.f8553g));
                    break;
                case 2:
                    imageButton.setId(O8.s.f8473V);
                    imageButton.setImageDrawable(AbstractC5338c.getDrawable(context, O8.r.f8420h));
                    imageButton.setContentDescription(context.getString(O8.u.f8561o));
                    break;
                case 3:
                    imageButton.setId(O8.s.f8475X);
                    imageButton.setImageDrawable(AbstractC5338c.getDrawable(context, O8.r.f8429q));
                    imageButton.setContentDescription(context.getString(O8.u.f8565s));
                    break;
                case 4:
                    imageButton.setId(O8.s.f8476Y);
                    imageButton.setImageDrawable(AbstractC5338c.getDrawable(context, O8.r.f8430r));
                    imageButton.setContentDescription(context.getString(O8.u.f8566t));
                    break;
                case 5:
                    imageButton.setId(O8.s.f8472U);
                    imageButton.setImageDrawable(AbstractC5338c.getDrawable(context, O8.r.f8419g));
                    imageButton.setContentDescription(context.getString(O8.u.f8554h));
                    break;
                case 6:
                    imageButton.setId(O8.s.f8474W);
                    imageButton.setImageDrawable(AbstractC5338c.getDrawable(context, O8.r.f8424l));
                    imageButton.setContentDescription(context.getString(O8.u.f8563q));
                    break;
            }
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: V8.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1743y.x(C1743y.this, view);
                }
            });
            arrayList2.add(imageButton);
            addView(imageButton);
        }
        this.f12810F.f(this);
        int i12 = 0;
        for (Object obj : arrayList2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            z(this.f12810F, (View) obj, i12 == 0 ? null : (View) arrayList2.get(i12 - 1), i12 == arrayList2.size() - 1 ? null : (View) arrayList2.get(i13));
            i12 = i13;
        }
        androidx.constraintlayout.widget.d dVar = this.f12810F;
        this.f12809E = dVar;
        this.f12812H.g(dVar);
        this.f12812H.z(O8.s.f8472U, 8);
        this.f12812H.z(O8.s.f8474W, 8);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            View view = (View) obj2;
            if (view.getTag() != GPHContentType.emoji && view.getTag() != GPHContentType.recents) {
                arrayList3.add(obj2);
            }
        }
        for (Object obj3 : arrayList3) {
            int i14 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            z(this.f12812H, (View) obj3, i10 == 0 ? null : (View) arrayList3.get(i10 - 1), i10 == arrayList3.size() - 1 ? null : (View) arrayList3.get(i14));
            i10 = i14;
        }
        this.f12811G.g(this.f12812H);
        androidx.constraintlayout.widget.d dVar2 = this.f12809E;
        if (dVar2 != null) {
            dVar2.c(this);
        }
        B();
    }

    private final void setLayoutType(a aVar) {
        a aVar2 = this.f12808D;
        if (aVar2 != aVar) {
            this.f12806B.invoke(aVar2, aVar);
        }
        this.f12808D = aVar;
    }

    public static void x(C1743y this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.giphy.sdk.ui.GPHContentType");
        this$0.setGphContentType((GPHContentType) tag);
        this$0.f12805A.invoke(this$0.f12807C);
    }

    public final void A(boolean z10) {
        if (z10 && Intrinsics.areEqual(this.f12809E, this.f12810F)) {
            y(this.f12812H);
            setLayoutType(a.SearchFocus);
        }
        if (z10 || !Intrinsics.areEqual(this.f12809E, this.f12812H)) {
            return;
        }
        y(this.f12810F);
        setLayoutType(a.Browse);
    }

    public final void B() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            ImageButton imageButton = childAt instanceof ImageButton ? (ImageButton) childAt : null;
            if (imageButton != null) {
                imageButton.setColorFilter(this.f12813z.u());
            }
            if (childAt.getTag() == this.f12807C) {
                ImageButton imageButton2 = childAt instanceof ImageButton ? (ImageButton) childAt : null;
                if (imageButton2 != null) {
                    imageButton2.setColorFilter(this.f12813z.v());
                }
            }
        }
    }

    public final void C(boolean z10) {
        androidx.constraintlayout.widget.d dVar;
        if (z10) {
            setLayoutType(a.SearchFocus);
            dVar = this.f12812H;
        } else {
            setLayoutType(a.Browse);
            dVar = this.f12810F;
        }
        y(dVar);
    }

    public final void D() {
        y(this.f12811G);
        setLayoutType(a.SearchResults);
    }

    @NotNull
    public final GPHContentType getGphContentType() {
        return this.f12807C;
    }

    @NotNull
    public final a getLayoutType() {
        return this.f12808D;
    }

    @NotNull
    public final Function2<a, a, Unit> getLayoutTypeListener() {
        return this.f12806B;
    }

    @NotNull
    public final Function1<GPHContentType, Unit> getMediaConfigListener() {
        return this.f12805A;
    }

    @NotNull
    public final S8.e getTheme() {
        return this.f12813z;
    }

    public final void setGphContentType(@NotNull GPHContentType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f12807C = value;
        B();
    }

    public final void setLayoutTypeListener(@NotNull Function2<? super a, ? super a, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f12806B = function2;
    }

    public final void setMediaConfigListener(@NotNull Function1<? super GPHContentType, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f12805A = function1;
    }

    public final void y(androidx.constraintlayout.widget.d dVar) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1));
        transitionSet.setInterpolator((TimeInterpolator) new AnticipateOvershootInterpolator(1.0f));
        transitionSet.setDuration(300L);
        if (Intrinsics.areEqual(dVar, this.f12809E)) {
            return;
        }
        TransitionManager.beginDelayedTransition(this, transitionSet);
        this.f12809E = dVar;
        dVar.c(this);
    }

    public final void z(androidx.constraintlayout.widget.d dVar, View view, View view2, View view3) {
        dVar.h(view.getId(), 3, 0, 3);
        dVar.h(view.getId(), 4, 0, 4);
        dVar.h(view.getId(), 6, view2 != null ? view2.getId() : 0, view2 == null ? 6 : 7);
        dVar.h(view.getId(), 7, view3 != null ? view3.getId() : 0, view3 == null ? 7 : 6);
        dVar.y(view.getId(), 3, U8.f.a(10));
        dVar.l(view.getId(), 0);
        dVar.y(view.getId(), 4, U8.f.a(10));
        dVar.m(view.getId(), -2);
    }
}
