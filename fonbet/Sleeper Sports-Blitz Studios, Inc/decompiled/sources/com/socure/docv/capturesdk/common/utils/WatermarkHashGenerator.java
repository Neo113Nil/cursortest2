package com.socure.docv.capturesdk.common.utils;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.msgpack.core.MessagePack;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: WatermarkHashGenerator.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/WatermarkHashGenerator;", "", "()V", "generateHash", "", MetricTracker.Object.INPUT, "", "generateHashPayload", "sessionToken", "moduleId", "processImage", "imageBytes", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WatermarkHashGenerator {
    public static final int $stable = 0;
    public static final WatermarkHashGenerator INSTANCE = new WatermarkHashGenerator();

    private WatermarkHashGenerator() {
    }

    public final byte[] processImage(byte[] imageBytes, String sessionToken, String moduleId) {
        Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        byte[] generateHashPayload = generateHashPayload(sessionToken, moduleId);
        int length = imageBytes.length;
        byte[] array = ByteBuffer.allocate(length + 36).put(imageBytes, 0, length - 2).put((byte) -1).put((byte) -30).put((byte) 0).put(BuiltinOptions.TopKV2Options).put(generateHashPayload).put((byte) -1).put(MessagePack.Code.STR8).array();
        Intrinsics.checkNotNullExpressionValue(array, "allocate(totalSize)\n    …e())\n            .array()");
        return array;
    }

    private final byte[] generateHashPayload(String sessionToken, String moduleId) {
        return generateHash(sessionToken + "-" + moduleId);
    }

    private final byte[] generateHash(String input) {
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "getInstance(\"SHA-256\").digest(input.toByteArray())");
        return digest;
    }
}
