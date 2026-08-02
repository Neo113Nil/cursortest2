package com.blaze.blazesdk.data_source;

import androidx.annotation.Keep;
import defpackage.azl;
import defpackage.hbm;
import defpackage.q8m;
import defpackage.w2m;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "", "Lhbm;", "expression", "<init>", "(Lhbm;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhbm;", "", "getStringLabelExpression", "()Ljava/lang/String;", "stringLabelExpression", "Companion", "com/blaze/blazesdk/data_source/f", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeWidgetLabel {

    @NotNull
    private final hbm expression;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private BlazeWidgetLabel(hbm hbmVar) {
        this.expression = hbmVar;
    }

    public boolean equals(@Nullable Object other) {
        BlazeWidgetLabel blazeWidgetLabel = other instanceof BlazeWidgetLabel ? (BlazeWidgetLabel) other : null;
        if (blazeWidgetLabel == null) {
            return false;
        }
        return Intrinsics.c(this.expression, blazeWidgetLabel.expression);
    }

    @NotNull
    public final String getStringLabelExpression() {
        return this.expression.a();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\n\"\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\n\"\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0002\u0010\u000eJ\u001f\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel$Companion;", "", "<init>", "()V", "singleLabel", "Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "item", "", "mustInclude", "items", "", "([Ljava/lang/String;)Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "atLeastOneOf", "expressions", "([Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;)Lcom/blaze/blazesdk/data_source/BlazeWidgetLabel;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BlazeWidgetLabel atLeastOneOf(@NotNull String... items) {
            items.getClass();
            ArrayList arrayList = new ArrayList(items.length);
            for (String str : items) {
                arrayList.add(new q8m(str));
            }
            return new BlazeWidgetLabel(new w2m(arrayList), null);
        }

        @NotNull
        public final BlazeWidgetLabel mustInclude(@NotNull String... items) {
            items.getClass();
            ArrayList arrayList = new ArrayList(items.length);
            for (String str : items) {
                arrayList.add(new q8m(str));
            }
            return new BlazeWidgetLabel(new azl(arrayList), null);
        }

        @NotNull
        public final BlazeWidgetLabel singleLabel(@NotNull String item) {
            item.getClass();
            return new BlazeWidgetLabel(new q8m(item), null);
        }

        private Companion() {
        }

        @NotNull
        public final BlazeWidgetLabel atLeastOneOf(@NotNull BlazeWidgetLabel... expressions) {
            expressions.getClass();
            ArrayList arrayList = new ArrayList(expressions.length);
            for (BlazeWidgetLabel blazeWidgetLabel : expressions) {
                arrayList.add(blazeWidgetLabel.expression);
            }
            return new BlazeWidgetLabel(new w2m(arrayList), null);
        }

        @NotNull
        public final BlazeWidgetLabel mustInclude(@NotNull BlazeWidgetLabel... expressions) {
            expressions.getClass();
            ArrayList arrayList = new ArrayList(expressions.length);
            for (BlazeWidgetLabel blazeWidgetLabel : expressions) {
                arrayList.add(blazeWidgetLabel.expression);
            }
            return new BlazeWidgetLabel(new azl(arrayList), null);
        }
    }

    public /* synthetic */ BlazeWidgetLabel(hbm hbmVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(hbmVar);
    }
}
