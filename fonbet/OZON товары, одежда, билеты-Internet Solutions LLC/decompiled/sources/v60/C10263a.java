package v60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: v60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10263a implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f102441a;

    public C10263a(@NotNull C10264b startRecordAudioBridgeInterface, @NotNull C10265c stopRecordAudioBridgeInterface) {
        Intrinsics.checkNotNullParameter(startRecordAudioBridgeInterface, "startRecordAudioBridgeInterface");
        Intrinsics.checkNotNullParameter(stopRecordAudioBridgeInterface, "stopRecordAudioBridgeInterface");
        this.f102441a = C7714v.b0(startRecordAudioBridgeInterface, stopRecordAudioBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f102441a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "audio_record";
    }
}
