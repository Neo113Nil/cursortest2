package ru.ozon.fintech.features.camera.scanners.mlkit.utils;

import F70.c;
import L80.a;
import Sc.InterfaceC4008j;
import Sc.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/mlkit/utils/DetectedPhoneHandler;", "", "", "phoneRegex", "<init>", "(Ljava/lang/String;)V", "", "list", "handle", "(Ljava/util/List;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "phonePattern$delegate", "LSc/j;", "getPhonePattern", "()Ljava/util/regex/Pattern;", "phonePattern", "Companion", "camera-scanners-mlkit_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DetectedPhoneHandler {

    @NotNull
    private static final String TAG = "DetectedPhoneHandler";

    /* renamed from: phonePattern$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j phonePattern;

    public DetectedPhoneHandler(String str) {
        this.phonePattern = k.b(new c(str, 7));
    }

    private final Pattern getPhonePattern() {
        return (Pattern) this.phonePattern.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern phonePattern_delegate$lambda$0(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return Pattern.compile(str);
        } catch (Exception e11) {
            a.c(TAG, "Error while invoke Pattern.compile(" + str + ")", e11);
            return null;
        }
    }

    @NotNull
    public final List<String> handle(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        Pattern phonePattern = getPhonePattern();
        if (phonePattern == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Matcher matcher = phonePattern.matcher((String) it.next());
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            String group = matcher.find() ? matcher.group() : null;
            if (group != null) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }
}
