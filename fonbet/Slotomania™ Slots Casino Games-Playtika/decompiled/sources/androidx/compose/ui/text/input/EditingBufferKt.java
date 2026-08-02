package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m4099updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m3935getLengthimpl;
        int m3937getMinimpl = TextRange.m3937getMinimpl(j);
        int m3936getMaximpl = TextRange.m3936getMaximpl(j);
        if (TextRange.m3941intersects5zctL8(j2, j)) {
            if (TextRange.m3929contains5zctL8(j2, j)) {
                m3937getMinimpl = TextRange.m3937getMinimpl(j2);
                m3936getMaximpl = m3937getMinimpl;
            } else {
                if (TextRange.m3929contains5zctL8(j, j2)) {
                    m3935getLengthimpl = TextRange.m3935getLengthimpl(j2);
                } else if (TextRange.m3930containsimpl(j2, m3937getMinimpl)) {
                    m3937getMinimpl = TextRange.m3937getMinimpl(j2);
                    m3935getLengthimpl = TextRange.m3935getLengthimpl(j2);
                } else {
                    m3936getMaximpl = TextRange.m3937getMinimpl(j2);
                }
                m3936getMaximpl -= m3935getLengthimpl;
            }
        } else if (m3936getMaximpl > TextRange.m3937getMinimpl(j2)) {
            m3937getMinimpl -= TextRange.m3935getLengthimpl(j2);
            m3935getLengthimpl = TextRange.m3935getLengthimpl(j2);
            m3936getMaximpl -= m3935getLengthimpl;
        }
        return TextRangeKt.TextRange(m3937getMinimpl, m3936getMaximpl);
    }
}
