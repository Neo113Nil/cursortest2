package zendesk.talk.android.internal.call;

import Dj.f;
import Dj.g;
import Dj.j;
import Dj.k;
import Dj.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.twilio.voice.EventKeys;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.talk.android.internal.call.TalkCallView;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001:\u0002Z[B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\b\b\u0001\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010\u000eJ\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010\u0015J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u0015J\u0017\u00101\u001a\u00020\f2\u0006\u0010)\u001a\u00020,H\u0002¢\u0006\u0004\b1\u0010/J\u0013\u00102\u001a\u00020\n*\u00020,H\u0002¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u0004\u0018\u000105*\u00020,2\u0006\u00104\u001a\u00020,H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010?\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010:R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010BR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010O\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\bM\u0010NR\u001b\u0010Q\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010L\u001a\u0004\bP\u0010NR\u001b\u0010S\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bR\u0010NR\u001b\u0010U\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010L\u001a\u0004\bT\u0010NR\u001b\u0010W\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010L\u001a\u0004\bV\u0010NR\u001b\u0010Y\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010L\u001a\u0004\bX\u0010N¨\u0006\\"}, d2 = {"Lzendesk/talk/android/internal/call/TalkCallView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "muted", "", "setMuted", "(Z)V", "LDj/b;", "audioOutput", "bluetoothSupported", "M", "(LDj/b;Z)V", "I", "()V", "Landroid/view/View$OnClickListener;", "listener", "setOnEndCallListener", "(Landroid/view/View$OnClickListener;)V", "setOnMuteCallListener", "setOnChangeAudioListener", "", EventKeys.VALUE_KEY, "setCallTimerText", "(Ljava/lang/CharSequence;)V", "titleResId", "setTitle", "(I)V", "loading", "setLoading", "K", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lzendesk/talk/android/internal/call/TalkCallView$AudioState;", "newState", "H", "(Lzendesk/talk/android/internal/call/TalkCallView$AudioState;)V", "L", "G", "J", "(Lzendesk/talk/android/internal/call/TalkCallView$AudioState;)Z", "next", "Landroidx/vectordrawable/graphics/drawable/c;", "D", "(Lzendesk/talk/android/internal/call/TalkCallView$AudioState;Lzendesk/talk/android/internal/call/TalkCallView$AudioState;)Landroidx/vectordrawable/graphics/drawable/c;", "Landroid/widget/ImageButton;", "z", "Landroid/widget/ImageButton;", "changeAudio", "A", "endCall", "B", "muteCall", "Landroid/widget/TextView;", "C", "Landroid/widget/TextView;", "callTimer", "callTitle", "Landroidx/core/widget/ContentLoadingProgressBar;", "E", "Landroidx/core/widget/ContentLoadingProgressBar;", ReactProgressBarViewManager.PROP_PROGRESS, "F", "Lzendesk/talk/android/internal/call/TalkCallView$AudioState;", "audioState", "Lkotlin/Lazy;", "getBluetoothToSmartphoneAnim", "()Landroidx/vectordrawable/graphics/drawable/c;", "bluetoothToSmartphoneAnim", "getBluetoothToSpeakersAnim", "bluetoothToSpeakersAnim", "getSmartphoneToBluetoothAnim", "smartphoneToBluetoothAnim", "getSpeakersToBluetoothAnim", "speakersToBluetoothAnim", "getSmartphoneToSpeakersAnim", "smartphoneToSpeakersAnim", "getSpeakersToSmartphoneAnim", "speakersToSmartphoneAnim", "AudioState", "SavedState", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TalkCallView extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final ImageButton endCall;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final ImageButton muteCall;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final TextView callTimer;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final TextView callTitle;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final ContentLoadingProgressBar progress;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public AudioState audioState;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public final Lazy bluetoothToSmartphoneAnim;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public final Lazy bluetoothToSpeakersAnim;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public final Lazy smartphoneToBluetoothAnim;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public final Lazy speakersToBluetoothAnim;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    public final Lazy smartphoneToSpeakersAnim;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    public final Lazy speakersToSmartphoneAnim;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final ImageButton changeAudio;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lzendesk/talk/android/internal/call/TalkCallView$AudioState;", "Landroid/os/Parcelable;", "LDj/b;", "audioOutput", "", "bluetoothSupported", "<init>", "(LDj/b;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LDj/b;", "()LDj/b;", com.google.crypto.tink.integration.android.b.f37029b, "Z", "()Z", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AudioState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AudioState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final Dj.b audioOutput;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean bluetoothSupported;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AudioState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AudioState(parcel.readInt() == 0 ? null : Dj.b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AudioState[] newArray(int i10) {
                return new AudioState[i10];
            }
        }

        public AudioState(Dj.b bVar, boolean z10) {
            this.audioOutput = bVar;
            this.bluetoothSupported = z10;
        }

        /* renamed from: a, reason: from getter */
        public final Dj.b getAudioOutput() {
            return this.audioOutput;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getBluetoothSupported() {
            return this.bluetoothSupported;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioState)) {
                return false;
            }
            AudioState audioState = (AudioState) other;
            return this.audioOutput == audioState.audioOutput && this.bluetoothSupported == audioState.bluetoothSupported;
        }

        public int hashCode() {
            Dj.b bVar = this.audioOutput;
            return ((bVar == null ? 0 : bVar.hashCode()) * 31) + Boolean.hashCode(this.bluetoothSupported);
        }

        public String toString() {
            return "AudioState(audioOutput=" + this.audioOutput + ", bluetoothSupported=" + this.bluetoothSupported + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Dj.b bVar = this.audioOutput;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeInt(this.bluetoothSupported ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lzendesk/talk/android/internal/call/TalkCallView$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "<init>", "(Landroid/os/Parcelable;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lzendesk/talk/android/internal/call/TalkCallView$AudioState;", "a", "Lzendesk/talk/android/internal/call/TalkCallView$AudioState;", "()Lzendesk/talk/android/internal/call/TalkCallView$AudioState;", com.google.crypto.tink.integration.android.b.f37029b, "(Lzendesk/talk/android/internal/call/TalkCallView$AudioState;)V", "audioState", "talk-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public AudioState audioState;

        @JvmField
        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return newArray(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable superState) {
            super(superState);
            Intrinsics.checkNotNullParameter(superState, "superState");
        }

        /* renamed from: a, reason: from getter */
        public final AudioState getAudioState() {
            return this.audioState;
        }

        public final void b(AudioState audioState) {
            this.audioState = audioState;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeParcelable(this.audioState, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.audioState = (AudioState) source.readParcelable(SavedState.class.getClassLoader());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TalkCallView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final androidx.vectordrawable.graphics.drawable.c E(Context context) {
        return Xj.c.j(context, j.f2843f);
    }

    public static final androidx.vectordrawable.graphics.drawable.c F(Context context) {
        return Xj.c.j(context, j.f2844g);
    }

    public static final androidx.vectordrawable.graphics.drawable.c N(Context context) {
        return Xj.c.j(context, j.f2845h);
    }

    public static final androidx.vectordrawable.graphics.drawable.c O(Context context) {
        return Xj.c.j(context, j.f2846i);
    }

    public static final androidx.vectordrawable.graphics.drawable.c P(Context context) {
        return Xj.c.j(context, j.f2847j);
    }

    public static final androidx.vectordrawable.graphics.drawable.c Q(Context context) {
        return Xj.c.j(context, j.f2848k);
    }

    private final androidx.vectordrawable.graphics.drawable.c getBluetoothToSmartphoneAnim() {
        return (androidx.vectordrawable.graphics.drawable.c) this.bluetoothToSmartphoneAnim.getValue();
    }

    private final androidx.vectordrawable.graphics.drawable.c getBluetoothToSpeakersAnim() {
        return (androidx.vectordrawable.graphics.drawable.c) this.bluetoothToSpeakersAnim.getValue();
    }

    private final androidx.vectordrawable.graphics.drawable.c getSmartphoneToBluetoothAnim() {
        return (androidx.vectordrawable.graphics.drawable.c) this.smartphoneToBluetoothAnim.getValue();
    }

    private final androidx.vectordrawable.graphics.drawable.c getSmartphoneToSpeakersAnim() {
        return (androidx.vectordrawable.graphics.drawable.c) this.smartphoneToSpeakersAnim.getValue();
    }

    private final androidx.vectordrawable.graphics.drawable.c getSpeakersToBluetoothAnim() {
        return (androidx.vectordrawable.graphics.drawable.c) this.speakersToBluetoothAnim.getValue();
    }

    private final androidx.vectordrawable.graphics.drawable.c getSpeakersToSmartphoneAnim() {
        return (androidx.vectordrawable.graphics.drawable.c) this.speakersToSmartphoneAnim.getValue();
    }

    public final androidx.vectordrawable.graphics.drawable.c D(AudioState audioState, AudioState audioState2) {
        Dj.b audioOutput = audioState2.getAudioOutput();
        if (Gj.c.a(audioState.getAudioOutput()) && Gj.c.b(audioOutput)) {
            return getBluetoothToSmartphoneAnim();
        }
        if (Gj.c.a(audioState.getAudioOutput()) && Gj.c.c(audioOutput)) {
            return getBluetoothToSpeakersAnim();
        }
        if (Gj.c.c(audioState.getAudioOutput()) && Gj.c.a(audioOutput)) {
            return getSpeakersToBluetoothAnim();
        }
        if (Gj.c.c(audioState.getAudioOutput()) && Gj.c.b(audioOutput)) {
            return getSpeakersToSmartphoneAnim();
        }
        if (Gj.c.b(audioState.getAudioOutput()) && Gj.c.a(audioOutput)) {
            return getSmartphoneToBluetoothAnim();
        }
        if (Gj.c.b(audioState.getAudioOutput()) && Gj.c.c(audioOutput)) {
            return getSmartphoneToSpeakersAnim();
        }
        Tj.a.a("Not recognized audio output transition from " + audioState.getAudioOutput() + " to " + audioOutput);
        return null;
    }

    public final void G(AudioState state) {
        this.changeAudio.setActivated(J(state));
    }

    public final void H(AudioState newState) {
        if (newState.getBluetoothSupported()) {
            androidx.vectordrawable.graphics.drawable.c D10 = D(this.audioState, newState);
            if (D10 != null) {
                this.changeAudio.setImageDrawable(D10);
                D10.start();
            }
        } else {
            this.changeAudio.setImageResource(j.f2842e);
        }
        G(newState);
    }

    public final void I() {
        Xj.j.c(this.muteCall, true, 0L, 2, null);
        Xj.j.c(this.changeAudio, true, 0L, 2, null);
    }

    public final boolean J(AudioState audioState) {
        if (audioState.getBluetoothSupported()) {
            return true;
        }
        return Gj.c.c(audioState.getAudioOutput());
    }

    public final void K() {
        this.callTimer.startAnimation(AnimationUtils.loadAnimation(getContext(), f.f2828a));
    }

    public final void L() {
        Integer valueOf = !this.audioState.getBluetoothSupported() ? Integer.valueOf(j.f2842e) : Gj.c.c(this.audioState.getAudioOutput()) ? Integer.valueOf(j.f2842e) : Gj.c.b(this.audioState.getAudioOutput()) ? Integer.valueOf(j.f2841d) : Gj.c.a(this.audioState.getAudioOutput()) ? Integer.valueOf(j.f2838a) : null;
        if (valueOf != null) {
            this.changeAudio.setImageResource(valueOf.intValue());
        }
        H(this.audioState);
    }

    public final void M(Dj.b audioOutput, boolean bluetoothSupported) {
        AudioState audioState = new AudioState(audioOutput, bluetoothSupported);
        if (Intrinsics.areEqual(this.audioState, audioState)) {
            return;
        }
        H(audioState);
        this.audioState = audioState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        super.onRestoreInstanceState(state);
        AudioState audioState = ((SavedState) state).getAudioState();
        if (audioState != null) {
            this.audioState = audioState;
            L();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.b(this.audioState);
        return savedState;
    }

    public final void setCallTimerText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.callTimer.setText(value);
    }

    public final void setLoading(boolean loading) {
        Xj.j.c(this.progress, loading, 0L, 2, null);
        Xj.j.c(this.callTimer, !loading, 0L, 2, null);
    }

    public final void setMuted(boolean muted) {
        this.muteCall.setActivated(muted);
    }

    public final void setOnChangeAudioListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.changeAudio.setOnClickListener(listener);
    }

    public final void setOnEndCallListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.endCall.setOnClickListener(listener);
    }

    public final void setOnMuteCallListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.muteCall.setOnClickListener(listener);
    }

    public final void setTitle(int titleResId) {
        this.callTitle.setText(titleResId);
    }

    public /* synthetic */ TalkCallView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TalkCallView(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.audioState = new AudioState(Dj.b.f2813a, false);
        this.bluetoothToSmartphoneAnim = LazyKt.lazy(new Function0() { // from class: Fj.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                androidx.vectordrawable.graphics.drawable.c E10;
                E10 = TalkCallView.E(context);
                return E10;
            }
        });
        this.bluetoothToSpeakersAnim = LazyKt.lazy(new Function0() { // from class: Fj.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                androidx.vectordrawable.graphics.drawable.c F10;
                F10 = TalkCallView.F(context);
                return F10;
            }
        });
        this.smartphoneToBluetoothAnim = LazyKt.lazy(new Function0() { // from class: Fj.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                androidx.vectordrawable.graphics.drawable.c N10;
                N10 = TalkCallView.N(context);
                return N10;
            }
        });
        this.speakersToBluetoothAnim = LazyKt.lazy(new Function0() { // from class: Fj.E
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                androidx.vectordrawable.graphics.drawable.c P10;
                P10 = TalkCallView.P(context);
                return P10;
            }
        });
        this.smartphoneToSpeakersAnim = LazyKt.lazy(new Function0() { // from class: Fj.F
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                androidx.vectordrawable.graphics.drawable.c O10;
                O10 = TalkCallView.O(context);
                return O10;
            }
        });
        this.speakersToSmartphoneAnim = LazyKt.lazy(new Function0() { // from class: Fj.G
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                androidx.vectordrawable.graphics.drawable.c Q10;
                Q10 = TalkCallView.Q(context);
                return Q10;
            }
        });
        LayoutInflater.from(context).inflate(l.f2875i, (ViewGroup) this, true);
        ImageButton imageButton = (ImageButton) findViewById(k.f2852d);
        this.changeAudio = imageButton;
        this.endCall = (ImageButton) findViewById(k.f2862n);
        ImageButton imageButton2 = (ImageButton) findViewById(k.f2863o);
        this.muteCall = imageButton2;
        this.callTimer = (TextView) findViewById(k.f2855g);
        this.callTitle = (TextView) findViewById(k.f2856h);
        this.progress = (ContentLoadingProgressBar) findViewById(k.f2853e);
        setBackgroundColor(Xj.c.k(context, g.f2829a));
        if (Uj.c.a()) {
            Uj.a aVar = Uj.a.f12311a;
            aVar.a(imageButton2);
            aVar.a(imageButton);
        }
    }
}
