package ru.ozon.app.android.mediaupload.video;

import Pc.a;
import Sc.s;
import Vd0.b;
import android.content.Context;
import android.net.Uri;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationEvent;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationWebSocket;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/mediaupload/video/validation/VideoValidationEvent$ValidResult$ValidOk;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/mediaupload/video/validation/VideoValidationEvent$ValidResult$ValidOk;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.VideoNetworkDataStore$validate$2", f = "VideoNetworkDataStore.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class VideoNetworkDataStore$validate$2 extends j implements Function2<M, d<? super VideoValidationEvent.ValidResult.ValidOk>, Object> {
    final /* synthetic */ String $uploadProcessId;
    final /* synthetic */ String $videoType;
    final /* synthetic */ Uri $videoUri;
    Object L$0;
    int label;
    final /* synthetic */ VideoNetworkDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoNetworkDataStore$validate$2(VideoNetworkDataStore videoNetworkDataStore, Uri uri, String str, String str2, d<? super VideoNetworkDataStore$validate$2> dVar) {
        super(2, dVar);
        this.this$0 = videoNetworkDataStore;
        this.$videoUri = uri;
        this.$videoType = str;
        this.$uploadProcessId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoNetworkDataStore$validate$2(this.this$0, this.$videoUri, this.$videoType, this.$uploadProcessId, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Context context;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        ?? r12 = this.label;
        try {
            if (r12 == 0) {
                s.b(obj);
                aVar = this.this$0.socketsProvider;
                VideoValidationWebSocket videoValidationWebSocket = (VideoValidationWebSocket) aVar.get();
                context = this.this$0.appContext;
                InputStream openInputStream = context.getContentResolver().openInputStream(this.$videoUri);
                VideoNetworkDataStore videoNetworkDataStore = this.this$0;
                String str = this.$videoType;
                String str2 = this.$uploadProcessId;
                Intrinsics.f(videoValidationWebSocket);
                Intrinsics.g(openInputStream, "null cannot be cast to non-null type java.io.FileInputStream");
                this.L$0 = openInputStream;
                this.label = 1;
                obj = videoNetworkDataStore.validate(videoValidationWebSocket, (FileInputStream) openInputStream, str, str2, this);
                r12 = openInputStream;
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Closeable closeable = (Closeable) this.L$0;
                s.b(obj);
                r12 = closeable;
            }
            VideoValidationEvent.ValidResult.ValidOk validOk = (VideoValidationEvent.ValidResult.ValidOk) obj;
            b.a(r12, null);
            return validOk;
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super VideoValidationEvent.ValidResult.ValidOk> dVar) {
        return ((VideoNetworkDataStore$validate$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
