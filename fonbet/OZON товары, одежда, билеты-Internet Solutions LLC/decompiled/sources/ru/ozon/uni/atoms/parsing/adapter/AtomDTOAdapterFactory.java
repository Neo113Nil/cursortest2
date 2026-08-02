package ru.ozon.uni.atoms.parsing.adapter;

import Ep.a;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.flashbar.model.RestrictionActionButton;
import ru.ozon.uni.android.flashbar.model.RestrictionActionButtonJsonAdapter;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonJsonAdapter;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsBadge.DsBadgeDTOJsonAdapter;
import ru.ozon.uni.atoms.data.dsCell.CellControlAtom;
import ru.ozon.uni.atoms.data.dsCell.CellControlAtomDTOJsonAdapter;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTOValidationsKt;
import ru.ozon.uni.atoms.data.tabs.DsTabsDTOJsonAdapter;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.models.UniToken;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/atoms/parsing/adapter/AtomDTOAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$a;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/Moshi;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/Moshi;)Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/parsing/adapter/EnumNullFallbackAdapterFactory;", "enumsAdapterFactory", "Lru/ozon/uni/atoms/parsing/adapter/EnumNullFallbackAdapterFactory;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public class AtomDTOAdapterFactory implements JsonAdapter.a {

    @NotNull
    private final EnumNullFallbackAdapterFactory enumsAdapterFactory = new EnumNullFallbackAdapterFactory();

    @Override // com.squareup.moshi.JsonAdapter.a
    public JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(type, "type");
        Class b11 = a.b(annotations, "annotations", moshi, "moshi", type);
        if (Intrinsics.d(b11, AtomDTO.class) && annotations.isEmpty()) {
            return new AtomPolymorphicJsonAdapter(moshi);
        }
        if (Intrinsics.d(b11, AtomDTO.class) && D.f(annotations, CellControlAtom.class) != null) {
            return new CellControlAtomDTOJsonAdapter(moshi);
        }
        if (Intrinsics.d(b11, Object.class) && D.f(annotations, RestrictionActionButton.class) != null) {
            return new RestrictionActionButtonJsonAdapter(moshi);
        }
        if (Intrinsics.d(b11, BadgeDTO.class)) {
            JsonAdapter h11 = moshi.h(this, type, annotations);
            Intrinsics.checkNotNullExpressionValue(h11, "nextAdapter(...)");
            return new DsBadgeDTOJsonAdapter(h11);
        }
        if (Intrinsics.d(b11, TagButtonDTO.class)) {
            JsonAdapter h12 = moshi.h(this, type, annotations);
            Intrinsics.checkNotNullExpressionValue(h12, "nextAdapter(...)");
            return new TagButtonJsonAdapter(h12);
        }
        if (Intrinsics.d(b11, NotificationDTO.class)) {
            JsonAdapter h13 = moshi.h(this, type, annotations);
            Intrinsics.checkNotNullExpressionValue(h13, "nextAdapter(...)");
            return new AtomDTOExceptionJsonAdapter(h13, NotificationDTOValidationsKt.getNotificationValidations());
        }
        if (Intrinsics.d(b11, TabsDTO.class)) {
            JsonAdapter h14 = moshi.h(this, type, annotations);
            Intrinsics.checkNotNullExpressionValue(h14, "nextAdapter(...)");
            return new DsTabsDTOJsonAdapter(h14);
        }
        if (!UniToken.class.isAssignableFrom(b11)) {
            return Intrinsics.d(b11, AtomActionDTO.class) ? new ActionAdapter(moshi) : Intrinsics.d(b11, OzonSpannableString.class) ? new HtmlMoshiAdapter() : this.enumsAdapterFactory.create(type, annotations, moshi);
        }
        Intrinsics.f(b11);
        return new UniTokenJsonAdapter(b11);
    }
}
