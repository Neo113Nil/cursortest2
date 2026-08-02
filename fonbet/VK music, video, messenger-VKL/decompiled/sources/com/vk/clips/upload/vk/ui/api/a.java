package com.vk.clips.upload.vk.ui.api;

import com.vk.clips.upload.model.TrendingHashtagData;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsTrendingHashtagRepository.kt */
/* loaded from: classes17.dex */
public interface a {

    /* compiled from: ClipsTrendingHashtagRepository.kt */
    /* renamed from: com.vk.clips.upload.vk.ui.api.a$a, reason: collision with other inner class name */
    public static final class C0701a {
        public static final /* synthetic */ C0701a a = new C0701a();
        private static final a STUB = new C0702a();

        /* compiled from: ClipsTrendingHashtagRepository.kt */
        /* renamed from: com.vk.clips.upload.vk.ui.api.a$a$a, reason: collision with other inner class name */
        public static final class C0702a implements a {
            @Override // com.vk.clips.upload.vk.ui.api.a
            public final List<TrendingHashtagData> R0() {
                return EmptyList.b;
            }

            @Override // com.vk.clips.upload.vk.ui.api.a
            public final Object a(ContinuationImpl continuationImpl) {
                return EmptyList.b;
            }
        }

        public final a getSTUB() {
            return STUB;
        }
    }

    List<TrendingHashtagData> R0();

    Object a(ContinuationImpl continuationImpl);
}
