package ru.ozon.app.android.pdp.view.photo360.presentation;

import AJ.d;
import D40.a;
import DJ.c;
import Lc.b;
import Sc.InterfaceC4008j;
import Sc.k;
import V.e;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import hd.C6915b;
import io.reactivex.p;
import io.reactivex.x;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.g;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360ImagesDataSet;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360Repository;
import ru.ozon.app.android.utils.rx.RxExtKt;
import sc.C9653a;
import sc.C9656b;
import wc.C10474C;
import wc.C10492m;
import wc.L;
import wc.Q;
import wc.v;
import wc.y;
import xe.C10727i;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010*\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360Repository;", "repository", "<init>", "(Lru/ozon/app/android/pdp/view/photo360/data/Photo360Repository;)V", "", "error", "", "onError", "(Ljava/lang/Throwable;)V", "", "scroll", "updateFrameIndex", "(F)V", "startAutoplay", "()V", "onCleared", "onUserFirstTouch", "onScroll", "", "width", "height", "loadInitialState", "(II)V", "loadImageOriginalSize", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360Repository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;", "liveData$delegate", "LSc/j;", "getLiveData", "()Landroidx/lifecycle/V;", "liveData", "_liveData", "Landroidx/lifecycle/V;", "Lnc/b;", "autoplayDisposable", "Lnc/b;", "LLc/b;", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "frameSubject", "LLc/b;", "currentIndex", "I", "currentWidth", "Companion", "Action", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Photo360ViewModel extends w0 {

    @NotNull
    private final V<Action> _liveData;

    @NotNull
    private InterfaceC8487b autoplayDisposable;
    private int currentIndex;
    private int currentWidth;

    @NotNull
    private final b<Drawable> frameSubject;

    /* renamed from: liveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j liveData;

    @NotNull
    private final Photo360Repository repository;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "drawable", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "invoke", "(Landroid/graphics/drawable/Drawable;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Drawable, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
            invoke2(drawable);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Drawable drawable) {
            V v11 = Photo360ViewModel.this._liveData;
            Intrinsics.f(drawable);
            v11.postValue(new Action.NewPhoto(drawable, false, 2, null));
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;", "", "<init>", "()V", "Loading", "ShowZoomDescription", "Ready", "Error", "NewPhoto", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Error;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Loading;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$NewPhoto;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Ready;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$ShowZoomDescription;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Error;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {

            @NotNull
            private final Throwable error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.error, ((Error) other).error);
            }

            @NotNull
            public final Throwable getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            @NotNull
            public String toString() {
                return a.c("Error(error=", ")", this.error);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Loading;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Loading extends Action {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$NewPhoto;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isOriginal", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NewPhoto extends Action {

            @NotNull
            private final Drawable drawable;
            private final boolean isOriginal;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewPhoto(@NotNull Drawable drawable, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                this.drawable = drawable;
                this.isOriginal = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NewPhoto)) {
                    return false;
                }
                NewPhoto newPhoto = (NewPhoto) other;
                return Intrinsics.d(this.drawable, newPhoto.drawable) && this.isOriginal == newPhoto.isOriginal;
            }

            @NotNull
            public final Drawable getDrawable() {
                return this.drawable;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isOriginal) + (this.drawable.hashCode() * 31);
            }

            /* renamed from: isOriginal, reason: from getter */
            public final boolean getIsOriginal() {
                return this.isOriginal;
            }

            @NotNull
            public String toString() {
                return "NewPhoto(drawable=" + this.drawable + ", isOriginal=" + this.isOriginal + ")";
            }

            public /* synthetic */ NewPhoto(Drawable drawable, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(drawable, (i11 & 2) != 0 ? false : z11);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$Ready;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;", "", "description", "zoomDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getZoomDescription", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Ready extends Action {
            private final String description;

            @NotNull
            private final String zoomDescription;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ready(String str, @NotNull String zoomDescription) {
                super(null);
                Intrinsics.checkNotNullParameter(zoomDescription, "zoomDescription");
                this.description = str;
                this.zoomDescription = zoomDescription;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ready)) {
                    return false;
                }
                Ready ready = (Ready) other;
                return Intrinsics.d(this.description, ready.description) && Intrinsics.d(this.zoomDescription, ready.zoomDescription);
            }

            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getZoomDescription() {
                return this.zoomDescription;
            }

            public int hashCode() {
                String str = this.description;
                return this.zoomDescription.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Ready(description=", this.description, ", zoomDescription=", this.zoomDescription, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action$ShowZoomDescription;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ShowZoomDescription extends Action {

            @NotNull
            public static final ShowZoomDescription INSTANCE = new ShowZoomDescription();

            private ShowZoomDescription() {
                super(null);
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Companion;", "", "<init>", "()V", "AUTOPLAY_PERIOD", "", "AUTOPLAY_MULTIPLIER", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Photo360ViewModel(@NotNull Photo360Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.liveData = k.b(new Photo360ViewModel$liveData$2(this));
        this._liveData = new V<>();
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.autoplayDisposable = a11;
        b<Drawable> m11 = b.m();
        Intrinsics.checkNotNullExpressionValue(m11, "create(...)");
        this.frameSubject = m11;
        C8486a a12 = C5415f.a(this);
        x a13 = Mc.a.a();
        C9656b.c(a13, "scheduler is null");
        C10492m c10492m = new C10492m(new C10474C(new Q(m11, a13, !false)), C9653a.i(), C9656b.b());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x a14 = Mc.a.a();
        C9656b.c(timeUnit, "unit is null");
        C9656b.c(a14, "scheduler is null");
        y f7 = new L(c10492m, a14).f(C8125a.a());
        DJ.e eVar = new DJ.e(new AnonymousClass1(), 4);
        g<Throwable> gVar = C9653a.f98525e;
        v vVar = v.INSTANCE;
        C9656b.c(vVar, "onSubscribe is null");
        Ec.e eVar2 = new Ec.e(eVar, gVar, vVar);
        f7.i(eVar2);
        Intrinsics.checkNotNullExpressionValue(eVar2, "subscribe(...)");
        RxExtKt.plusAssign(a12, eVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable error) {
        this._liveData.postValue(new Action.Error(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAutoplay() {
        int i11 = 1;
        this.autoplayDisposable = p.interval(10L, TimeUnit.MILLISECONDS).map(new c(Photo360ViewModel$startAutoplay$1.INSTANCE, i11)).observeOn(C8125a.a()).subscribe(new AJ.c(new Photo360ViewModel$startAutoplay$2(this), i11), new d(new Photo360ViewModel$startAutoplay$3(Lm0.a.f17149a), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float startAutoplay$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Float) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFrameIndex(float scroll) {
        List<Photo360ImagesDataSet.PhotoData> cachedImages = this.repository.getCachedImages();
        int size = cachedImages.size();
        if (size != 0) {
            int c11 = ((C6915b.c(scroll / ((this.currentWidth * 2) / size)) % size) + size) % size;
            this.currentIndex = c11;
            this.frameSubject.p(cachedImages.get(c11).getDrawable());
        }
    }

    @NotNull
    public final V<Action> getLiveData() {
        return (V) this.liveData.getValue();
    }

    public final void loadImageOriginalSize() {
        int i11 = this.currentIndex;
        boolean checkIfNotOriginalSize = this.repository.checkIfNotOriginalSize(i11);
        boolean checkIfRequestIsNotActive = this.repository.checkIfRequestIsNotActive(this.currentIndex);
        if (checkIfNotOriginalSize && checkIfRequestIsNotActive) {
            this.repository.addCurrentRequest(this.currentIndex);
            C10727i.c(x0.a(this), null, null, new Photo360ViewModel$loadImageOriginalSize$1(this, i11, null), 3);
        }
    }

    public final void loadInitialState(int width, int height) {
        this.currentWidth = width;
        C10727i.c(x0.a(this), null, null, new Photo360ViewModel$loadInitialState$1(this, width, height, null), 3);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.autoplayDisposable.dispose();
    }

    public final void onScroll(float scroll) {
        updateFrameIndex(scroll);
    }

    public final void onUserFirstTouch() {
        if (this.autoplayDisposable.isDisposed()) {
            return;
        }
        this.autoplayDisposable.dispose();
        this._liveData.postValue(Action.ShowZoomDescription.INSTANCE);
    }
}
