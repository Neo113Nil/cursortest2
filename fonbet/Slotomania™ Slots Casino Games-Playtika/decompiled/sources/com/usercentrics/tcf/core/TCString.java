package com.usercentrics.tcf.core;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.tcf.core.encoder.Base64Url;
import com.usercentrics.tcf.core.encoder.BitLength;
import com.usercentrics.tcf.core.encoder.SegmentEncoder;
import com.usercentrics.tcf.core.encoder.SemanticPreEncoder;
import com.usercentrics.tcf.core.encoder.field.IntEncoder;
import com.usercentrics.tcf.core.encoder.sequence.SegmentSequence;
import com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType;
import com.usercentrics.tcf.core.errors.DecodingError;
import com.usercentrics.tcf.core.errors.EncodingError;
import com.usercentrics.tcf.core.model.Segment;
import com.usercentrics.tcf.core.model.SegmentIDs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TCString.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/tcf/core/TCString;", "", "()V", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TCString {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: TCString.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/usercentrics/tcf/core/TCString$Companion;", "", "()V", "decode", "Lcom/usercentrics/tcf/core/TCModel;", "encodedTCString", "", "tcModel", "decode$usercentrics_release", "encode", "encode$usercentrics_release", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String encode$usercentrics_release(TCModel tcModel) {
            Intrinsics.checkNotNullParameter(tcModel, "tcModel");
            TCModel process = SemanticPreEncoder.INSTANCE.process(tcModel);
            int version_ = process.getVersion_();
            if (version_ != 2) {
                throw new EncodingError("Unsupported TCF version: " + version_);
            }
            SequenceVersionMapType two = new SegmentSequence(process).getTwo();
            Intrinsics.checkNotNull(two, "null cannot be cast to non-null type com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType.List");
            List<Segment> value = ((SequenceVersionMapType.List) two).getValue();
            int i = 0;
            String str = "";
            for (Object obj : value) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                str = ((Object) str) + SegmentEncoder.INSTANCE.encode$usercentrics_release(process, (Segment) obj) + (i < value.size() + (-1) ? "." : "");
                i = i2;
            }
            return str;
        }

        public final TCModel decode$usercentrics_release(String encodedTCString, TCModel tcModel) {
            Intrinsics.checkNotNullParameter(encodedTCString, "encodedTCString");
            Intrinsics.checkNotNullParameter(tcModel, "tcModel");
            int version_ = tcModel.getVersion_();
            if (version_ != 2) {
                throw new DecodingError("Unable TCF String with version " + version_);
            }
            List split$default = StringsKt.split$default((CharSequence) encodedTCString, new String[]{"."}, false, 0, 6, (Object) null);
            int size = split$default.size();
            TCModel tCModel = null;
            for (int i = 0; i < size; i++) {
                String str = (String) split$default.get(i);
                String substring = Base64Url.INSTANCE.decode(String.valueOf(str.charAt(0))).substring(0, BitLength.segmentType.getInteger());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                tCModel = SegmentEncoder.INSTANCE.decode(str, tcModel, SegmentIDs.INSTANCE.getID_TO_KEY().get((int) IntEncoder.INSTANCE.decode(substring, BitLength.segmentType.getInteger())).getType());
            }
            if (tCModel != null) {
                return tCModel;
            }
            throw new DecodingError("Unable to decode given TCModel");
        }
    }
}
