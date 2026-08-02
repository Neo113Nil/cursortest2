package ru.ozon.uni.core.repository.implementation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniTypographyToken;
import ru.ozon.uni.core.repository.UniTypographyTokenRepository;

@Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0089\u0001\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u001a\u0010'\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\fR\u001a\u0010)\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u001a\u0010+\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u0010-\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u001a\u0010/\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u001a\u00101\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u001a\u00103\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u0010\fR\u001a\u00105\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\fR\u001a\u00107\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\fR\u001a\u00109\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\fR\u001a\u0010;\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR\u001a\u0010=\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010\fR\u001a\u0010?\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b@\u0010\fR\u001a\u0010A\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u001a\u0010C\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010\fR\u001a\u0010E\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\fR\u001a\u0010G\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\fR\u001a\u0010I\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\fR\u001a\u0010K\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010\n\u001a\u0004\bL\u0010\fR\u001a\u0010M\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR\u001a\u0010O\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010\n\u001a\u0004\bP\u0010\fR\u001a\u0010Q\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\fR\u001a\u0010S\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010\fR\u001a\u0010U\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010\n\u001a\u0004\bV\u0010\fR\u001a\u0010W\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\fR\u001a\u0010Y\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\fR\u001a\u0010[\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\n\u001a\u0004\b\\\u0010\fR\u001a\u0010]\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010\n\u001a\u0004\b^\u0010\fR\u001a\u0010_\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010\fR\u001a\u0010a\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010\n\u001a\u0004\bb\u0010\fR\u001a\u0010c\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\fR\u001a\u0010e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010\n\u001a\u0004\bf\u0010\fR\u001a\u0010g\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010\n\u001a\u0004\bh\u0010\fR\u001a\u0010i\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010\n\u001a\u0004\bj\u0010\fR\u001a\u0010k\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010\n\u001a\u0004\bl\u0010\fR\u001a\u0010m\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010\n\u001a\u0004\bn\u0010\fR\u001a\u0010o\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010\n\u001a\u0004\bp\u0010\fR\u001a\u0010q\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010\fR\u001a\u0010s\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010\n\u001a\u0004\bt\u0010\fR\u001a\u0010u\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010\n\u001a\u0004\bv\u0010\fR\u001a\u0010w\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010\n\u001a\u0004\bx\u0010\fR\u001a\u0010y\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010\n\u001a\u0004\bz\u0010\fR\u001a\u0010{\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010\n\u001a\u0004\b|\u0010\fR\u001a\u0010}\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b}\u0010\n\u001a\u0004\b~\u0010\fR\u001b\u0010\u007f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\r\n\u0004\b\u007f\u0010\n\u001a\u0005\b\u0080\u0001\u0010\fR\u001d\u0010\u0081\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\n\u001a\u0005\b\u0082\u0001\u0010\fR\u001d\u0010\u0083\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\n\u001a\u0005\b\u0084\u0001\u0010\fR\u001d\u0010\u0085\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\n\u001a\u0005\b\u0086\u0001\u0010\fR\u001d\u0010\u0087\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\n\u001a\u0005\b\u0088\u0001\u0010\fR\u001d\u0010\u0089\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\n\u001a\u0005\b\u008a\u0001\u0010\fR\u001d\u0010\u008b\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\n\u001a\u0005\b\u008c\u0001\u0010\fR\u001d\u0010\u008d\u0001\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\n\u001a\u0005\b\u008e\u0001\u0010\f¨\u0006\u008f\u0001"}, d2 = {"Lru/ozon/uni/core/repository/implementation/UniTypographyTokenRepositoryImpl;", "Lru/ozon/uni/core/repository/UniTypographyTokenRepository;", "<init>", "()V", "", "tokenId", "Lru/ozon/uni/core/models/UniTypographyToken;", "getById", "(Ljava/lang/String;)Lru/ozon/uni/core/models/UniTypographyToken;", "bodyAccent100Caption", "Lru/ozon/uni/core/models/UniTypographyToken;", "getBodyAccent100Caption", "()Lru/ozon/uni/core/models/UniTypographyToken;", "bodyAccent250Caption", "getBodyAccent250Caption", "bodyAccent300XSmall", "getBodyAccent300XSmall", "bodyAccent400Small", "getBodyAccent400Small", "bodyAccent500Medium", "getBodyAccent500Medium", "bodyControl300XSmall", "getBodyControl300XSmall", "bodyControl400Small", "getBodyControl400Small", "bodyControl500Medium", "getBodyControl500Medium", "bodyControl600Large", "getBodyControl600Large", "bodyControl700Large", "getBodyControl700Large", "bodyControl700XLarge", "getBodyControl700XLarge", "bodyNumeric200XSmall", "getBodyNumeric200XSmall", "bodyNumeric300XSmall", "getBodyNumeric300XSmall", "bodyNumeric400Small", "getBodyNumeric400Small", "bodyNumeric500Medium", "getBodyNumeric500Medium", "bodyNumeric600Large", "getBodyNumeric600Large", "bodyPromo300XSmall", "getBodyPromo300XSmall", "body200XSmall", "getBody200XSmall", "body300XSmall", "getBody300XSmall", "body400Large", "getBody400Large", "body400Small", "getBody400Small", "body450Small", "getBody450Small", "body500Large", "getBody500Large", "body500Medium", "getBody500Medium", "body500Small", "getBody500Small", "body600Medium", "getBody600Medium", "compactControl300XSmall", "getCompactControl300XSmall", "compactControl400Small", "getCompactControl400Small", "compactControl500Medium", "getCompactControl500Medium", "compactNumeric400Small", "getCompactNumeric400Small", "compactNumeric600Large", "getCompactNumeric600Large", "compact300XSmall", "getCompact300XSmall", "compact400Large", "getCompact400Large", "compact400Small", "getCompact400Small", "compact450Small", "getCompact450Small", "compact500Medium", "getCompact500Medium", "compact550Medium", "getCompact550Medium", "compact600Large", "getCompact600Large", "headlineCompact400Medium", "getHeadlineCompact400Medium", "headlineCompact400Small", "getHeadlineCompact400Small", "headlineNumeric700XLarge", "getHeadlineNumeric700XLarge", "headlineNumeric800XxLarge", "getHeadlineNumeric800XxLarge", "headlinePromo400Small", "getHeadlinePromo400Small", "headlinePromo500Medium", "getHeadlinePromo500Medium", "headline300XSmall", "getHeadline300XSmall", "headline400Small", "getHeadline400Small", "headline500Medium", "getHeadline500Medium", "headline500XMedium", "getHeadline500XMedium", "headline550Medium", "getHeadline550Medium", "headline600Large", "getHeadline600Large", "headline600Medium", "getHeadline600Medium", "headline700XLarge", "getHeadline700XLarge", "headline800XxLarge", "getHeadline800XxLarge", "headline900XxLarge", "getHeadline900XxLarge", "keyPromo200XSmall", "getKeyPromo200XSmall", "keyPromo400Large", "getKeyPromo400Large", "keyPromo400Medium", "getKeyPromo400Medium", "keyPromo500Medium", "getKeyPromo500Medium", "keyPromo600Large", "getKeyPromo600Large", "keyPromo600XLarge", "getKeyPromo600XLarge", "keyPromo650Large", "getKeyPromo650Large", "keyPromo700Large", "getKeyPromo700Large", "keyPromo700XLarge", "getKeyPromo700XLarge", "keyPromo800Large", "getKeyPromo800Large", "keyPromo800Small", "getKeyPromo800Small", "keyPromo900Medium", "getKeyPromo900Medium", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniTypographyTokenRepositoryImpl implements UniTypographyTokenRepository {

    @NotNull
    public static final UniTypographyTokenRepositoryImpl INSTANCE = new UniTypographyTokenRepositoryImpl();

    @NotNull
    private static final UniTypographyToken bodyAccent100Caption = new UniTypographyToken("tsBodyAccent100Caption", true);

    @NotNull
    private static final UniTypographyToken bodyAccent250Caption = new UniTypographyToken("tsBodyAccent250Caption", true);

    @NotNull
    private static final UniTypographyToken bodyAccent300XSmall = new UniTypographyToken("tsBodyAccent300XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyAccent400Small = new UniTypographyToken("tsBodyAccent400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyAccent500Medium = new UniTypographyToken("tsBodyAccent500Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyControl300XSmall = new UniTypographyToken("tsBodyControl300XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyControl400Small = new UniTypographyToken("tsBodyControl400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyControl500Medium = new UniTypographyToken("tsBodyControl500Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyControl600Large = new UniTypographyToken("tsBodyControl600Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyControl700Large = new UniTypographyToken("tsBodyControl700Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyControl700XLarge = new UniTypographyToken("tsBodyControl700XLarge", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyNumeric200XSmall = new UniTypographyToken("tsBodyNumeric200XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyNumeric300XSmall = new UniTypographyToken("tsBodyNumeric300XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyNumeric400Small = new UniTypographyToken("tsBodyNumeric400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyNumeric500Medium = new UniTypographyToken("tsBodyNumeric500Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyNumeric600Large = new UniTypographyToken("tsBodyNumeric600Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken bodyPromo300XSmall = new UniTypographyToken("tsBodyPromo300XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken body200XSmall = new UniTypographyToken("tsBody200XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken body300XSmall = new UniTypographyToken("tsBody300XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken body400Large = new UniTypographyToken("tsBody400Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken body400Small = new UniTypographyToken("tsBody400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken body450Small = new UniTypographyToken("tsBody450Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken body500Large = new UniTypographyToken("tsBody500Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken body500Medium = new UniTypographyToken("tsBody500Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken body500Small = new UniTypographyToken("tsBody500Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken body600Medium = new UniTypographyToken("tsBody600Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken compactControl300XSmall = new UniTypographyToken("tsCompactControl300XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken compactControl400Small = new UniTypographyToken("tsCompactControl400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken compactControl500Medium = new UniTypographyToken("tsCompactControl500Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken compactNumeric400Small = new UniTypographyToken("tsCompactNumeric400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken compactNumeric600Large = new UniTypographyToken("tsCompactNumeric600Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken compact300XSmall = new UniTypographyToken("tsCompact300XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken compact400Large = new UniTypographyToken("tsCompact400Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken compact400Small = new UniTypographyToken("tsCompact400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken compact450Small = new UniTypographyToken("tsCompact450Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken compact500Medium = new UniTypographyToken("tsCompact500Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken compact550Medium = new UniTypographyToken("tsCompact550Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken compact600Large = new UniTypographyToken("tsCompact600Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken headlineCompact400Medium = new UniTypographyToken("tsHeadlineCompact400Medium", true);

    @NotNull
    private static final UniTypographyToken headlineCompact400Small = new UniTypographyToken("tsHeadlineCompact400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken headlineNumeric700XLarge = new UniTypographyToken("tsHeadlineNumeric700XLarge", false, 2, null);

    @NotNull
    private static final UniTypographyToken headlineNumeric800XxLarge = new UniTypographyToken("tsHeadlineNumeric800XxLarge", false, 2, null);

    @NotNull
    private static final UniTypographyToken headlinePromo400Small = new UniTypographyToken("tsHeadlinePromo400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken headlinePromo500Medium = new UniTypographyToken("tsHeadlinePromo500Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken headline300XSmall = new UniTypographyToken("tsHeadline300XSmall", true);

    @NotNull
    private static final UniTypographyToken headline400Small = new UniTypographyToken("tsHeadline400Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken headline500Medium = new UniTypographyToken("tsHeadline500Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken headline500XMedium = new UniTypographyToken("tsHeadline500XMedium", false, 2, null);

    @NotNull
    private static final UniTypographyToken headline550Medium = new UniTypographyToken("tsHeadline550Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken headline600Large = new UniTypographyToken("tsHeadline600Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken headline600Medium = new UniTypographyToken("tsHeadline600Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken headline700XLarge = new UniTypographyToken("tsHeadline700XLarge", false, 2, null);

    @NotNull
    private static final UniTypographyToken headline800XxLarge = new UniTypographyToken("tsHeadline800XxLarge", false, 2, null);

    @NotNull
    private static final UniTypographyToken headline900XxLarge = new UniTypographyToken("tsHeadline900XxLarge", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo200XSmall = new UniTypographyToken("tsKeyPromo200XSmall", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo400Large = new UniTypographyToken("tsKeyPromo400Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo400Medium = new UniTypographyToken("tsKeyPromo400Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo500Medium = new UniTypographyToken("tsKeyPromo500Medium", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo600Large = new UniTypographyToken("tsKeyPromo600Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo600XLarge = new UniTypographyToken("tsKeyPromo600XLarge", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo650Large = new UniTypographyToken("tsKeyPromo650Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo700Large = new UniTypographyToken("tsKeyPromo700Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo700XLarge = new UniTypographyToken("tsKeyPromo700XLarge", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo800Large = new UniTypographyToken("tsKeyPromo800Large", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo800Small = new UniTypographyToken("tsKeyPromo800Small", false, 2, null);

    @NotNull
    private static final UniTypographyToken keyPromo900Medium = new UniTypographyToken("tsKeyPromo900Medium", false, 2, null);

    private UniTypographyTokenRepositoryImpl() {
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBody200XSmall() {
        return body200XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBody300XSmall() {
        return body300XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBody400Large() {
        return body400Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBody400Small() {
        return body400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBody450Small() {
        return body450Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBody500Large() {
        return body500Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBody500Medium() {
        return body500Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBody500Small() {
        return body500Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBody600Medium() {
        return body600Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyAccent100Caption() {
        return bodyAccent100Caption;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyAccent250Caption() {
        return bodyAccent250Caption;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyAccent300XSmall() {
        return bodyAccent300XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyAccent400Small() {
        return bodyAccent400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyAccent500Medium() {
        return bodyAccent500Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyControl300XSmall() {
        return bodyControl300XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyControl400Small() {
        return bodyControl400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyControl500Medium() {
        return bodyControl500Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyControl600Large() {
        return bodyControl600Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyControl700Large() {
        return bodyControl700Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyControl700XLarge() {
        return bodyControl700XLarge;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyNumeric200XSmall() {
        return bodyNumeric200XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyNumeric300XSmall() {
        return bodyNumeric300XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyNumeric400Small() {
        return bodyNumeric400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyNumeric500Medium() {
        return bodyNumeric500Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyNumeric600Large() {
        return bodyNumeric600Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getBodyPromo300XSmall() {
        return bodyPromo300XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompact300XSmall() {
        return compact300XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompact400Large() {
        return compact400Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompact400Small() {
        return compact400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompact450Small() {
        return compact450Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompact500Medium() {
        return compact500Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompact550Medium() {
        return compact550Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompact600Large() {
        return compact600Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompactControl300XSmall() {
        return compactControl300XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompactControl400Small() {
        return compactControl400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompactControl500Medium() {
        return compactControl500Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompactNumeric400Small() {
        return compactNumeric400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getCompactNumeric600Large() {
        return compactNumeric600Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline300XSmall() {
        return headline300XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline400Small() {
        return headline400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline500Medium() {
        return headline500Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline500XMedium() {
        return headline500XMedium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline550Medium() {
        return headline550Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline600Large() {
        return headline600Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline600Medium() {
        return headline600Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline700XLarge() {
        return headline700XLarge;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline800XxLarge() {
        return headline800XxLarge;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadline900XxLarge() {
        return headline900XxLarge;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadlineCompact400Medium() {
        return headlineCompact400Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadlineCompact400Small() {
        return headlineCompact400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadlineNumeric700XLarge() {
        return headlineNumeric700XLarge;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadlineNumeric800XxLarge() {
        return headlineNumeric800XxLarge;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadlinePromo400Small() {
        return headlinePromo400Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getHeadlinePromo500Medium() {
        return headlinePromo500Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo200XSmall() {
        return keyPromo200XSmall;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo400Large() {
        return keyPromo400Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo400Medium() {
        return keyPromo400Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo500Medium() {
        return keyPromo500Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo600Large() {
        return keyPromo600Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo600XLarge() {
        return keyPromo600XLarge;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo650Large() {
        return keyPromo650Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo700Large() {
        return keyPromo700Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo700XLarge() {
        return keyPromo700XLarge;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo800Large() {
        return keyPromo800Large;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo800Small() {
        return keyPromo800Small;
    }

    @Override // ru.ozon.uni.core.repository.UniTypographyTokenRepository
    @NotNull
    public UniTypographyToken getKeyPromo900Medium() {
        return keyPromo900Medium;
    }

    @Override // ru.ozon.uni.core.repository.UniTokenRepository
    public UniTypographyToken getById(@NotNull String tokenId) {
        Map map;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        map = UniTypographyTokenRepositoryImplKt.tokenMap;
        return (UniTypographyToken) map.get(tokenId);
    }
}
