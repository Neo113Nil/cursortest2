package ru.ozon.app.android.videomoleculecompose.slots.centeraction;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.videomoleculecompose.intent.VideoMoleculeIntent;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toIntent", "Lru/ozon/app/android/videomoleculecompose/intent/VideoMoleculeIntent;", "Lru/ozon/app/android/videomoleculecompose/slots/centeraction/VideoMoleculeCenterAction;", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeCenterActionKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoMoleculeCenterAction.values().length];
            try {
                iArr[VideoMoleculeCenterAction.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoMoleculeCenterAction.Replay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final VideoMoleculeIntent toIntent(@NotNull VideoMoleculeCenterAction videoMoleculeCenterAction) {
        Intrinsics.checkNotNullParameter(videoMoleculeCenterAction, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[videoMoleculeCenterAction.ordinal()];
        if (i11 == 1) {
            return VideoMoleculeIntent.TogglePlayback.INSTANCE;
        }
        if (i11 == 2) {
            return VideoMoleculeIntent.Replay.INSTANCE;
        }
        throw new o();
    }
}
