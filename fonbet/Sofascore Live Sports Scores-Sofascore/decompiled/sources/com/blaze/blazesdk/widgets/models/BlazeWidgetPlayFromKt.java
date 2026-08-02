package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFrom;
import defpackage.ipm;
import defpackage.zzl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "", "Lipm;", "items", "", "resolveIndex", "(Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;Ljava/util/List;)Ljava/lang/Integer;", "blazesdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeWidgetPlayFromKt {
    @Keep
    @Nullable
    public static final Integer resolveIndex(@NotNull BlazeWidgetPlayFrom blazeWidgetPlayFrom, @Nullable List<ipm> list) {
        blazeWidgetPlayFrom.getClass();
        if (list == null) {
            return null;
        }
        if (blazeWidgetPlayFrom instanceof BlazeWidgetPlayFrom.Index) {
            BlazeWidgetPlayFrom.Index index = (BlazeWidgetPlayFrom.Index) blazeWidgetPlayFrom;
            if (index.getIndex() >= 0 && index.getIndex() < list.size()) {
                return Integer.valueOf(index.getIndex());
            }
        } else {
            if (!(blazeWidgetPlayFrom instanceof BlazeWidgetPlayFrom.ContentId)) {
                zzl.b();
                return null;
            }
            Iterator<T> it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                if (Intrinsics.c(((ipm) next).a, ((BlazeWidgetPlayFrom.ContentId) blazeWidgetPlayFrom).getContentId())) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }
}
