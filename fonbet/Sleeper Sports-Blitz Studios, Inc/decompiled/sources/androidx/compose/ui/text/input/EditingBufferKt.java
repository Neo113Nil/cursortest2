package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m8397updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m8228getLengthimpl;
        int m8230getMinimpl = TextRange.m8230getMinimpl(j);
        int m8229getMaximpl = TextRange.m8229getMaximpl(j);
        if (TextRange.m8234intersects5zctL8(j2, j)) {
            if (TextRange.m8222contains5zctL8(j2, j)) {
                m8230getMinimpl = TextRange.m8230getMinimpl(j2);
                m8229getMaximpl = m8230getMinimpl;
            } else {
                if (TextRange.m8222contains5zctL8(j, j2)) {
                    m8228getLengthimpl = TextRange.m8228getLengthimpl(j2);
                } else if (TextRange.m8223containsimpl(j2, m8230getMinimpl)) {
                    m8230getMinimpl = TextRange.m8230getMinimpl(j2);
                    m8228getLengthimpl = TextRange.m8228getLengthimpl(j2);
                } else {
                    m8229getMaximpl = TextRange.m8230getMinimpl(j2);
                }
                m8229getMaximpl -= m8228getLengthimpl;
            }
        } else if (m8229getMaximpl > TextRange.m8230getMinimpl(j2)) {
            m8230getMinimpl -= TextRange.m8228getLengthimpl(j2);
            m8228getLengthimpl = TextRange.m8228getLengthimpl(j2);
            m8229getMaximpl -= m8228getLengthimpl;
        }
        return TextRangeKt.TextRange(m8230getMinimpl, m8229getMaximpl);
    }
}
