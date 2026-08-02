package ru.ozon.app.android.pikazon.internal;

import Sd0.f;
import Sd0.g;
import Yd0.b;
import Yd0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonImageWarmUpper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pikazon/internal/PikazonLPLibraryImpl;", "LYd0/c;", "", "disabledWarmUp", "cdnChooserEnabled", "<init>", "(ZZ)V", "", "libStart", "()V", "warmUpPikazon", "Z", "getDisabledWarmUp$lib_release", "()Z", "setDisabledWarmUp$lib_release", "(Z)V", "getCdnChooserEnabled$lib_release", "setCdnChooserEnabled$lib_release", "LSd0/g;", "sharedOutput", "LSd0/g;", "getSharedOutput", "()LSd0/g;", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonLPLibraryImpl extends c {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean libStarted;
    private boolean cdnChooserEnabled;
    private boolean disabledWarmUp;

    @NotNull
    private final g sharedOutput = new g() { // from class: ru.ozon.app.android.pikazon.internal.PikazonLPLibraryImpl$sharedOutput$1
        private final f linkHandler = new PikazonLPLibraryLinkHandler();

        @Override // Sd0.g
        public f getLinkHandler() {
            return this.linkHandler;
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pikazon/internal/PikazonLPLibraryImpl$Companion;", "", "<init>", "()V", "", "libStarted", "Z", "getLibStarted", "()Z", "setLibStarted", "(Z)V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getLibStarted() {
            return PikazonLPLibraryImpl.libStarted;
        }

        private Companion() {
        }
    }

    public PikazonLPLibraryImpl(boolean z11, boolean z12) {
        this.disabledWarmUp = z11;
        this.cdnChooserEnabled = z12;
    }

    @Override // Sd0.d
    @NotNull
    public g getSharedOutput() {
        return this.sharedOutput;
    }

    @Override // Sd0.d
    public void libStart() {
        warmUpPikazon();
        libStarted = true;
    }

    public final void setCdnChooserEnabled$lib_release(boolean z11) {
        this.cdnChooserEnabled = z11;
    }

    public final void setDisabledWarmUp$lib_release(boolean z11) {
        this.disabledWarmUp = z11;
    }

    public final void warmUpPikazon() {
        if (!this.cdnChooserEnabled || this.disabledWarmUp) {
            return;
        }
        b input = getInput();
        if ((input != null ? input.b() : null) != null) {
            b input2 = getInput();
            if ((input2 != null ? input2.a() : null) == null) {
                return;
            }
            PikazonImageWarmUpper pikazonImageWarmUpper = PikazonImageWarmUpper.INSTANCE;
            b input3 = getInput();
            pikazonImageWarmUpper.initialize(input3 != null ? input3.a() : null);
            pikazonImageWarmUpper.startConfigUpdateListening();
        }
    }
}
