package ru.ozon.app.android.ugc.widgets.reviewsPreview.video;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR$\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/video/PairCoordinator;", "", "Lkotlin/Function0;", "", "blockOnEntry", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "blockIndex", "", "onStart", "onStop", "register", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "activate", "()V", "deactivate", "nextBlock", "switchTo", "(I)V", "Lkotlin/jvm/functions/Function0;", "", "onStarts", "Ljava/util/Map;", "onStops", "", "isActive", "Z", "isPlaying", AppMeasurementSdk.ConditionalUserProperty.VALUE, "activeBlock", "I", "getActiveBlock", "()I", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PairCoordinator {
    private int activeBlock;

    @NotNull
    private final Function0<Integer> blockOnEntry;
    private boolean isActive;
    private boolean isPlaying;

    @NotNull
    private final Map<Integer, Function0<Unit>> onStarts;

    @NotNull
    private final Map<Integer, Function0<Unit>> onStops;

    public PairCoordinator(@NotNull Function0<Integer> blockOnEntry) {
        Intrinsics.checkNotNullParameter(blockOnEntry, "blockOnEntry");
        this.blockOnEntry = blockOnEntry;
        this.onStarts = new LinkedHashMap();
        this.onStops = new LinkedHashMap();
        this.activeBlock = blockOnEntry.invoke().intValue();
    }

    public final void activate() {
        this.isActive = true;
        if (this.isPlaying || !this.onStarts.containsKey(Integer.valueOf(this.activeBlock))) {
            return;
        }
        this.isPlaying = true;
        Function0<Unit> function0 = this.onStarts.get(Integer.valueOf(this.activeBlock));
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void deactivate() {
        this.isActive = false;
        if (this.isPlaying) {
            this.isPlaying = false;
            Function0<Unit> function0 = this.onStops.get(Integer.valueOf(this.activeBlock));
            if (function0 != null) {
                function0.invoke();
            }
        }
        this.activeBlock = this.blockOnEntry.invoke().intValue();
    }

    public final void register(int blockIndex, @NotNull Function0<Unit> onStart, @NotNull Function0<Unit> onStop) {
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        this.onStarts.put(Integer.valueOf(blockIndex), onStart);
        this.onStops.put(Integer.valueOf(blockIndex), onStop);
        if (this.isActive && this.activeBlock == blockIndex && !this.isPlaying) {
            this.isPlaying = true;
            onStart.invoke();
        }
    }

    public final void switchTo(int nextBlock) {
        if (this.isPlaying) {
            this.isPlaying = false;
            Function0<Unit> function0 = this.onStops.get(Integer.valueOf(this.activeBlock));
            if (function0 != null) {
                function0.invoke();
            }
        }
        this.activeBlock = nextBlock;
        if (this.isActive && this.onStarts.containsKey(Integer.valueOf(nextBlock))) {
            this.isPlaying = true;
            Function0<Unit> function02 = this.onStarts.get(Integer.valueOf(this.activeBlock));
            if (function02 != null) {
                function02.invoke();
            }
        }
    }
}
