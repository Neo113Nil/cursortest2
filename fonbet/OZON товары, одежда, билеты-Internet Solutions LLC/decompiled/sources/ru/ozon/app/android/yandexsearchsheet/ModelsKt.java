package ru.ozon.app.android.yandexsearchsheet;

import He0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.uni.atoms.data.AtomDTO;
import we0.m;

@Metadata(d1 = {"\u00002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u000f*\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"", "LHe0/a;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Warning;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/yandexsearchsheet/SuggestVO;", "toVO", "(Ljava/util/List;Ljava/util/List;)Lru/ozon/app/android/yandexsearchsheet/SuggestVO;", "Lwe0/m;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Coordinates;", "toCoordinates", "(Lwe0/m;)Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$Coordinates;", "Lru/ozon/uni/atoms/data/AtomDTO;", "unavailableAddressState", "addWarning", "(Lru/ozon/app/android/yandexsearchsheet/SuggestVO;Ljava/util/List;)Lru/ozon/app/android/yandexsearchsheet/SuggestVO;", "", "getPVZNumber", "(Ljava/lang/String;)Ljava/lang/String;", "removeBrackets", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModelsKt {
    @NotNull
    public static final SuggestVO addWarning(@NotNull SuggestVO suggestVO, List<? extends AtomDTO> list) {
        Object obj;
        Collection a02;
        Intrinsics.checkNotNullParameter(suggestVO, "<this>");
        Iterator<T> it = suggestVO.getSuggests().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SuggestVO.Suggest) obj) instanceof SuggestVO.Suggest.Warning) {
                break;
            }
        }
        if (obj != null) {
            a02 = K.f71697a;
        } else {
            List<? extends AtomDTO> list2 = list;
            a02 = (list2 == null || list2.isEmpty()) ? K.f71697a : C7714v.a0(new SuggestVO.Suggest.Warning(list));
        }
        return new SuggestVO(C7714v.p0(suggestVO.getSuggests(), a02));
    }

    public static final String getPVZNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MatchResult b11 = new Regex("\\[(.*?)]").b(0, str);
        if (b11 != null) {
            return b11.c().get(1);
        }
        return null;
    }

    @NotNull
    public static final String removeBrackets(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return h.z0(new Regex("\\[.*?]\\s*").replace(str, "")).toString();
    }

    @NotNull
    public static final SuggestVO.Suggest.Coordinates toCoordinates(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new SuggestVO.Suggest.Coordinates(Double.valueOf(mVar.getLatitude()), Double.valueOf(mVar.getLongitude()));
    }

    @NotNull
    public static final SuggestVO toVO(@NotNull List<a> list, @NotNull List<SuggestVO.Suggest.Warning> header) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(header, "header");
        List<SuggestVO.Suggest.Warning> list2 = header;
        List<a> list3 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list3, 10));
        for (a aVar : list3) {
            String obj = aVar.e().toString();
            String removeBrackets = removeBrackets(aVar.d().toString());
            String removeBrackets2 = removeBrackets(aVar.c().toString());
            String a11 = aVar.a();
            m b11 = aVar.b();
            arrayList.add(new SuggestVO.Suggest.SuggestInfo(obj, null, removeBrackets2, removeBrackets, null, a11, b11 != null ? toCoordinates(b11) : null, aVar.f(), getPVZNumber(aVar.d().toString()), 16, null));
        }
        return new SuggestVO(C7714v.p0(arrayList, list2));
    }
}
