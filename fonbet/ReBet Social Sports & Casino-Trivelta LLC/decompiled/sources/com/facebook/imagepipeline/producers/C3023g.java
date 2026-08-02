package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w6.InterfaceC6713d;

/* renamed from: com.facebook.imagepipeline.producers.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3023g extends C3025i {

    /* renamed from: d, reason: collision with root package name */
    public static final a f30773d = new a(null);

    /* renamed from: com.facebook.imagepipeline.producers.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3023g(A7.x memoryCache, A7.k cacheKeyFactory, d0 inputProducer) {
        super(memoryCache, cacheKeyFactory, inputProducer);
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
    }

    @Override // com.facebook.imagepipeline.producers.C3025i
    public String d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C3025i
    public String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C3025i
    public InterfaceC3030n g(InterfaceC3030n consumer, InterfaceC6713d cacheKey, boolean z10) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return consumer;
    }
}
