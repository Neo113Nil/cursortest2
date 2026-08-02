package ru.ozon.fintech.features.recordaudio.network;

import We.D;
import We.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/fintech/features/recordaudio/network/AudioRecordNetwork;", "", "Lretrofit2/Response;", "", "postForCachingTestCookie", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "LWe/D$c;", "uploadFile", "LWe/K;", "streamType", "", "sendAudioRecordChunk", "(LWe/D$c;LWe/K;Lkotlin/coroutines/d;)Ljava/lang/Object;", "record-audio_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AudioRecordNetwork {
    @GET(".")
    Object postForCachingTestCookie(@NotNull d<? super Response<List<Object>>> dVar);

    @POST("file/audio/upload")
    @Multipart
    Object sendAudioRecordChunk(@NotNull @Part D.c cVar, @NotNull @Part("streamType") K k11, @NotNull d<? super Response<Unit>> dVar);
}
