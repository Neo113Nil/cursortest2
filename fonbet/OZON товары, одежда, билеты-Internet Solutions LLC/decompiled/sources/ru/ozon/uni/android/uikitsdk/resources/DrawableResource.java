package ru.ozon.uni.android.uikitsdk.resources;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fJ\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "Lru/ozon/uni/android/uikitsdk/resources/TokenizedResource;", "Landroid/graphics/drawable/Drawable;", "isMulticolor", "", "()Z", "getResId", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Integer;", "Companion", "DrawableResourceImpl", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DrawableResource extends TokenizedResource<Drawable> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/uikitsdk/resources/DrawableResource$Companion;", "", "<init>", "()V", "fromToken", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "token", "", "fromTokenResolved", "context", "Landroid/content/Context;", "fromResources", "resources", "Landroid/content/res/Resources;", "resId", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final DrawableResource fromResources(@NotNull Resources resources, int resId) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            String resourceName = resources.getResourceName(resId);
            Intrinsics.checkNotNullExpressionValue(resourceName, "getResourceName(...)");
            return new DrawableResourceImpl(resourceName, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final DrawableResource fromToken(String token) {
            Integer num = null;
            Object[] objArr = 0;
            if (token == null || token.length() == 0) {
                return null;
            }
            return new DrawableResourceImpl(token, num, 2, objArr == true ? 1 : 0);
        }

        public final DrawableResource fromTokenResolved(String token, @NotNull Context context) {
            Integer loadDrawableByName;
            Intrinsics.checkNotNullParameter(context, "context");
            if (token == null || token.length() == 0 || (loadDrawableByName = TokensExtKt.loadDrawableByName(context, token)) == null) {
                return null;
            }
            return new DrawableResourceImpl(token, Integer.valueOf(loadDrawableByName.intValue()));
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\n\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/android/uikitsdk/resources/DrawableResource$DrawableResourceImpl;", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "", "token", "", "resId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/content/Context;", "context", "getResId", "(Landroid/content/Context;)Ljava/lang/Integer;", "", "vararg", "Landroid/graphics/drawable/Drawable;", "getValue", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "", "isMulticolor", "Z", "()Z", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DrawableResourceImpl implements DrawableResource {
        private final boolean isMulticolor;
        private final Integer resId;

        @NotNull
        private final String token;

        public DrawableResourceImpl(@NotNull String token, Integer num) {
            boolean isMulticolor;
            Intrinsics.checkNotNullParameter(token, "token");
            this.token = token;
            this.resId = num;
            isMulticolor = DrawableResourceKt.isMulticolor(getToken());
            this.isMulticolor = isMulticolor;
        }

        @Override // ru.ozon.uni.android.uikitsdk.resources.DrawableResource
        public Integer getResId(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Integer num = this.resId;
            return num == null ? TokensExtKt.loadDrawableByName(context, getToken()) : num;
        }

        @NotNull
        public String getToken() {
            return this.token;
        }

        @Override // ru.ozon.uni.android.uikitsdk.resources.DrawableResource
        /* renamed from: isMulticolor, reason: from getter */
        public boolean getIsMulticolor() {
            return this.isMulticolor;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ru.ozon.uni.android.uikitsdk.resources.TokenizedResource
        public Drawable getValue(@NotNull Context context, Object vararg) {
            Intrinsics.checkNotNullParameter(context, "context");
            Integer resId = getResId(context);
            if (resId != null) {
                return a.getDrawable(context, resId.intValue());
            }
            return null;
        }

        public /* synthetic */ DrawableResourceImpl(String str, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : num);
        }
    }

    Integer getResId(@NotNull Context context);

    /* renamed from: isMulticolor */
    boolean getIsMulticolor();
}
