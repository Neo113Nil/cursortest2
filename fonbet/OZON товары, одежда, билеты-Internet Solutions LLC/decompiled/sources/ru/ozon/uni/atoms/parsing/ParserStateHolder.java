package ru.ozon.uni.atoms.parsing;

import com.squareup.moshi.Moshi;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.rating.RatingAtom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOAdapterFactory;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00078\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/atoms/parsing/ParserStateHolder;", "", "<init>", "()V", "", "Lru/ozon/uni/atoms/parsing/AtomParserModel;", "set", "Lru/ozon/uni/atoms/parsing/ParseState;", "createConfig", "(Ljava/util/Set;)Lru/ozon/uni/atoms/parsing/ParseState;", "getBaseAtomDTO", "()Ljava/util/Set;", "", "initialize", "(Ljava/util/Set;)V", "config", "Lru/ozon/uni/atoms/parsing/ParseState;", "getConfig$uni_release", "()Lru/ozon/uni/atoms/parsing/ParseState;", "setConfig$uni_release", "(Lru/ozon/uni/atoms/parsing/ParseState;)V", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi$uni_release", "()Lcom/squareup/moshi/Moshi;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ParserStateHolder {
    public static final int $stable;

    @NotNull
    public static final ParserStateHolder INSTANCE = new ParserStateHolder();
    public static ParseState config;
    private static final Moshi moshi;

    static {
        Moshi.a aVar = new Moshi.a();
        aVar.a(new AtomDTOAdapterFactory());
        moshi = new Moshi(aVar);
        $stable = 8;
    }

    private ParserStateHolder() {
    }

    private final ParseState createConfig(Set<AtomParserModel> set) {
        LinkedHashSet<AtomParserModel> f7 = e0.f(getBaseAtomDTO(), set);
        HashMap hashMap = new HashMap(f7.size());
        HashMap hashMap2 = new HashMap(f7.size());
        for (AtomParserModel atomParserModel : f7) {
            hashMap.put(atomParserModel.getModel(), atomParserModel.getLabel());
            hashMap2.put(atomParserModel.getLabel(), atomParserModel.getModel());
        }
        return new ParseState(hashMap2, hashMap);
    }

    private final Set<AtomParserModel> getBaseAtomDTO() {
        AtomParserModel[] elements = {new AtomParserModel(AtomTypeImpl.TEXT_ATOM.getValue(), TextAtom.class), new AtomParserModel(AtomTypeImpl.TAG.getValue(), TagV3Atom.TagAtom.class), new AtomParserModel(AtomTypeImpl.LINK_TAG.getValue(), TagV3Atom.LinkTagAtom.class), new AtomParserModel(AtomTypeImpl.SMALL_LINK_TAG.getValue(), TagV3Atom.SmallLinkTagAtom.class), new AtomParserModel(AtomTypeImpl.CROSS_TAG.getValue(), TagV3Atom.CrossTagAtom.class), new AtomParserModel(AtomTypeImpl.CROSS_COLOR_TAG.getValue(), TagV3Atom.CrossColorTagAtom.class), new AtomParserModel(AtomTypeImpl.PRICE.getValue(), Price.class), new AtomParserModel(AtomTypeImpl.BADGE.getValue(), Badge.class), new AtomParserModel(AtomTypeImpl.RATING.getValue(), RatingAtom.class), new AtomParserModel(AtomTypeImpl.AVATAR.getValue(), Avatar.class)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @NotNull
    public final ParseState getConfig$uni_release() {
        ParseState parseState = config;
        if (parseState != null) {
            return parseState;
        }
        Intrinsics.n("config");
        throw null;
    }

    public final void initialize(@NotNull Set<AtomParserModel> set) {
        Intrinsics.checkNotNullParameter(set, "set");
        if (config == null) {
            setConfig$uni_release(createConfig(set));
        }
    }

    public final void setConfig$uni_release(@NotNull ParseState parseState) {
        Intrinsics.checkNotNullParameter(parseState, "<set-?>");
        config = parseState;
    }
}
