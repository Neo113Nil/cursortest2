package ru.ozon.app.android.travel.utils.html;

import android.text.Editable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u00062\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\tJ4\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\u0004\u0018\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00010\u0010J:\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\u0004\u0018\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00130\u0010¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/utils/html/OzonTagHelper;", "", "<init>", "()V", "markOpeningTag", "", "Landroid/text/Editable;", "spanMarks", "", "(Landroid/text/Editable;[Ljava/lang/Object;)Z", "replaceOpeningMarksWithSpan", "", "T", "spanMark", "Ljava/lang/Class;", "spanProducer", "Lkotlin/Function1;", "replaceOpeningMarksWithSpans", "spansProducer", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OzonTagHelper {

    @NotNull
    public static final OzonTagHelper INSTANCE = new OzonTagHelper();

    private OzonTagHelper() {
    }

    public final boolean markOpeningTag(Editable editable, @NotNull Object... spanMarks) {
        Intrinsics.checkNotNullParameter(spanMarks, "spanMarks");
        if (editable == null) {
            return false;
        }
        int length = editable.length();
        for (Object obj : spanMarks) {
            if (obj != null) {
                editable.setSpan(obj, length, length, 17);
            }
        }
        return true;
    }

    public final <T> void replaceOpeningMarksWithSpan(Editable editable, @NotNull Class<T> spanMark, @NotNull Function1<? super T, ? extends Object> spanProducer) {
        Object[] spans;
        Object R11;
        Intrinsics.checkNotNullParameter(spanMark, "spanMark");
        Intrinsics.checkNotNullParameter(spanProducer, "spanProducer");
        if (editable == null || (spans = editable.getSpans(0, editable.length(), spanMark)) == null || (R11 = C7705l.R(spans)) == null) {
            return;
        }
        int spanStart = editable.getSpanStart(R11);
        editable.removeSpan(R11);
        if (spanStart == editable.length()) {
            return;
        }
        Object invoke = spanProducer.invoke(R11);
        if (Intrinsics.d(invoke, Unit.f71690a)) {
            invoke = null;
        }
        if (invoke != null) {
            editable.setSpan(invoke, spanStart, editable.length(), 33);
        }
    }

    public final <T> void replaceOpeningMarksWithSpans(Editable editable, @NotNull Class<T> spanMark, @NotNull Function1<? super T, ? extends List<? extends Object>> spansProducer) {
        Object[] spans;
        Object R11;
        Intrinsics.checkNotNullParameter(spanMark, "spanMark");
        Intrinsics.checkNotNullParameter(spansProducer, "spansProducer");
        if (editable == null || (spans = editable.getSpans(0, editable.length(), spanMark)) == null || (R11 = C7705l.R(spans)) == null) {
            return;
        }
        int spanStart = editable.getSpanStart(R11);
        editable.removeSpan(R11);
        if (spanStart == editable.length()) {
            return;
        }
        for (Object obj : spansProducer.invoke(R11)) {
            if (!Intrinsics.d(obj, Unit.f71690a)) {
                editable.setSpan(obj, spanStart, editable.length(), 33);
            }
        }
    }
}
