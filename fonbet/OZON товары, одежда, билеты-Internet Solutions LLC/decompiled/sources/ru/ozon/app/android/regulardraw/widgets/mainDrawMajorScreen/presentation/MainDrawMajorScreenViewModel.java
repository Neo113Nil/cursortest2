package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation;

import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Nh.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState;", "state", "", "updateAnimationState", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState;)V", "LAe/h;", "observeAnimationState", "()LAe/h;", "LAe/w0;", "animationState", "LAe/w0;", "AnimationState", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenViewModel extends w0 {

    @NotNull
    private final Ae.w0<AnimationState> animationState = E0.b(1, 0, null, 6);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState;", "", "Empty", "Restart", "Start", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState$Empty;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState$Restart;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState$Start;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AnimationState {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState$Empty;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Empty implements AnimationState {

            @NotNull
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Empty);
            }

            public int hashCode() {
                return -1483257726;
            }

            @NotNull
            public String toString() {
                return "Empty";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState$Restart;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Restart implements AnimationState {

            @NotNull
            public static final Restart INSTANCE = new Restart();

            private Restart() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Restart);
            }

            public int hashCode() {
                return -1055168508;
            }

            @NotNull
            public String toString() {
                return "Restart";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState$Start;", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/presentation/MainDrawMajorScreenViewModel$AnimationState;", "", "percent", "", "text", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPercent", "Ljava/lang/String;", "getText", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Start implements AnimationState {
            private final int percent;

            @NotNull
            private final String text;

            public Start(int i11, @NotNull String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.percent = i11;
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Start)) {
                    return false;
                }
                Start start = (Start) other;
                return this.percent == start.percent && Intrinsics.d(this.text, start.text);
            }

            public final int getPercent() {
                return this.percent;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + (Integer.hashCode(this.percent) * 31);
            }

            @NotNull
            public String toString() {
                return a.c(this.percent, "Start(percent=", ", text=", this.text, ")");
            }
        }
    }

    @NotNull
    public final InterfaceC2395h<AnimationState> observeAnimationState() {
        return C2399j.a(this.animationState);
    }

    public final void updateAnimationState(@NotNull AnimationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C10727i.c(x0.a(this), null, null, new MainDrawMajorScreenViewModel$updateAnimationState$1(this, state, null), 3);
    }
}
