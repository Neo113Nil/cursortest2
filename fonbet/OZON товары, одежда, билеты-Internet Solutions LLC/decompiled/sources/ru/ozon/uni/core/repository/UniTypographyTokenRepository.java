package ru.ozon.uni.core.repository;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniTypographyToken;

@Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0003\b\u0086\u0001\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0012\u0010\u0003\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0012\u0010\u0018\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005R\u0012\u0010\u001a\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005R\u0012\u0010\u001e\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005R\u0012\u0010 \u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0012\u0010\"\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0005R\u0012\u0010$\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0012\u0010&\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0005R\u0012\u0010(\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0012\u0010*\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0005R\u0012\u0010,\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0005R\u0012\u0010.\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0005R\u0012\u00100\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0005R\u0012\u00102\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0005R\u0012\u00104\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u0012\u00106\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0005R\u0012\u00108\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0005R\u0012\u0010:\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0005R\u0012\u0010<\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0005R\u0012\u0010>\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0005R\u0012\u0010@\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0005R\u0012\u0010B\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005R\u0012\u0010D\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0005R\u0012\u0010F\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0005R\u0012\u0010H\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0005R\u0012\u0010J\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0005R\u0012\u0010L\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0005R\u0012\u0010N\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0005R\u0012\u0010P\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0005R\u0012\u0010R\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0005R\u0012\u0010T\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0005R\u0012\u0010V\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0005R\u0012\u0010X\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0005R\u0012\u0010Z\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0005R\u0012\u0010\\\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u0005R\u0012\u0010^\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0005R\u0012\u0010`\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0005R\u0012\u0010b\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u0005R\u0012\u0010d\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u0005R\u0012\u0010f\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0012\u0010h\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0012\u0010j\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0012\u0010l\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0012\u0010n\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0012\u0010p\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0012\u0010r\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u0005R\u0012\u0010t\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u0005R\u0012\u0010v\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010\u0005R\u0012\u0010x\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010\u0005R\u0012\u0010z\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\u0005R\u0012\u0010|\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u0005R\u0012\u0010~\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0005R\u0014\u0010\u0080\u0001\u001a\u00020\u0002X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0005R\u0014\u0010\u0082\u0001\u001a\u00020\u0002X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0005R\u0014\u0010\u0084\u0001\u001a\u00020\u0002X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u0005R\u0014\u0010\u0086\u0001\u001a\u00020\u0002X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u0005¨\u0006\u0088\u0001"}, d2 = {"Lru/ozon/uni/core/repository/UniTypographyTokenRepository;", "Lru/ozon/uni/core/repository/UniTokenRepository;", "Lru/ozon/uni/core/models/UniTypographyToken;", "bodyAccent100Caption", "getBodyAccent100Caption", "()Lru/ozon/uni/core/models/UniTypographyToken;", "bodyAccent250Caption", "getBodyAccent250Caption", "bodyAccent300XSmall", "getBodyAccent300XSmall", "bodyAccent400Small", "getBodyAccent400Small", "bodyAccent500Medium", "getBodyAccent500Medium", "bodyControl300XSmall", "getBodyControl300XSmall", "bodyControl400Small", "getBodyControl400Small", "bodyControl500Medium", "getBodyControl500Medium", "bodyControl600Large", "getBodyControl600Large", "bodyControl700Large", "getBodyControl700Large", "bodyControl700XLarge", "getBodyControl700XLarge", "bodyNumeric200XSmall", "getBodyNumeric200XSmall", "bodyNumeric300XSmall", "getBodyNumeric300XSmall", "bodyNumeric400Small", "getBodyNumeric400Small", "bodyNumeric500Medium", "getBodyNumeric500Medium", "bodyNumeric600Large", "getBodyNumeric600Large", "bodyPromo300XSmall", "getBodyPromo300XSmall", "body200XSmall", "getBody200XSmall", "body300XSmall", "getBody300XSmall", "body400Large", "getBody400Large", "body400Small", "getBody400Small", "body450Small", "getBody450Small", "body500Large", "getBody500Large", "body500Medium", "getBody500Medium", "body500Small", "getBody500Small", "body600Medium", "getBody600Medium", "compactControl300XSmall", "getCompactControl300XSmall", "compactControl400Small", "getCompactControl400Small", "compactControl500Medium", "getCompactControl500Medium", "compactNumeric400Small", "getCompactNumeric400Small", "compactNumeric600Large", "getCompactNumeric600Large", "compact300XSmall", "getCompact300XSmall", "compact400Large", "getCompact400Large", "compact400Small", "getCompact400Small", "compact450Small", "getCompact450Small", "compact500Medium", "getCompact500Medium", "compact550Medium", "getCompact550Medium", "compact600Large", "getCompact600Large", "headlineCompact400Medium", "getHeadlineCompact400Medium", "headlineCompact400Small", "getHeadlineCompact400Small", "headlineNumeric700XLarge", "getHeadlineNumeric700XLarge", "headlineNumeric800XxLarge", "getHeadlineNumeric800XxLarge", "headlinePromo400Small", "getHeadlinePromo400Small", "headlinePromo500Medium", "getHeadlinePromo500Medium", "headline300XSmall", "getHeadline300XSmall", "headline400Small", "getHeadline400Small", "headline500Medium", "getHeadline500Medium", "headline500XMedium", "getHeadline500XMedium", "headline550Medium", "getHeadline550Medium", "headline600Large", "getHeadline600Large", "headline600Medium", "getHeadline600Medium", "headline700XLarge", "getHeadline700XLarge", "headline800XxLarge", "getHeadline800XxLarge", "headline900XxLarge", "getHeadline900XxLarge", "keyPromo200XSmall", "getKeyPromo200XSmall", "keyPromo400Large", "getKeyPromo400Large", "keyPromo400Medium", "getKeyPromo400Medium", "keyPromo500Medium", "getKeyPromo500Medium", "keyPromo600Large", "getKeyPromo600Large", "keyPromo600XLarge", "getKeyPromo600XLarge", "keyPromo650Large", "getKeyPromo650Large", "keyPromo700Large", "getKeyPromo700Large", "keyPromo700XLarge", "getKeyPromo700XLarge", "keyPromo800Large", "getKeyPromo800Large", "keyPromo800Small", "getKeyPromo800Small", "keyPromo900Medium", "getKeyPromo900Medium", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface UniTypographyTokenRepository extends UniTokenRepository<UniTypographyToken> {
    @NotNull
    UniTypographyToken getBody200XSmall();

    @NotNull
    UniTypographyToken getBody300XSmall();

    @NotNull
    UniTypographyToken getBody400Large();

    @NotNull
    UniTypographyToken getBody400Small();

    @NotNull
    UniTypographyToken getBody450Small();

    @NotNull
    UniTypographyToken getBody500Large();

    @NotNull
    UniTypographyToken getBody500Medium();

    @NotNull
    UniTypographyToken getBody500Small();

    @NotNull
    UniTypographyToken getBody600Medium();

    @NotNull
    UniTypographyToken getBodyAccent100Caption();

    @NotNull
    UniTypographyToken getBodyAccent250Caption();

    @NotNull
    UniTypographyToken getBodyAccent300XSmall();

    @NotNull
    UniTypographyToken getBodyAccent400Small();

    @NotNull
    UniTypographyToken getBodyAccent500Medium();

    @NotNull
    UniTypographyToken getBodyControl300XSmall();

    @NotNull
    UniTypographyToken getBodyControl400Small();

    @NotNull
    UniTypographyToken getBodyControl500Medium();

    @NotNull
    UniTypographyToken getBodyControl600Large();

    @NotNull
    UniTypographyToken getBodyControl700Large();

    @NotNull
    UniTypographyToken getBodyControl700XLarge();

    @NotNull
    UniTypographyToken getBodyNumeric200XSmall();

    @NotNull
    UniTypographyToken getBodyNumeric300XSmall();

    @NotNull
    UniTypographyToken getBodyNumeric400Small();

    @NotNull
    UniTypographyToken getBodyNumeric500Medium();

    @NotNull
    UniTypographyToken getBodyNumeric600Large();

    @NotNull
    UniTypographyToken getBodyPromo300XSmall();

    @NotNull
    UniTypographyToken getCompact300XSmall();

    @NotNull
    UniTypographyToken getCompact400Large();

    @NotNull
    UniTypographyToken getCompact400Small();

    @NotNull
    UniTypographyToken getCompact450Small();

    @NotNull
    UniTypographyToken getCompact500Medium();

    @NotNull
    UniTypographyToken getCompact550Medium();

    @NotNull
    UniTypographyToken getCompact600Large();

    @NotNull
    UniTypographyToken getCompactControl300XSmall();

    @NotNull
    UniTypographyToken getCompactControl400Small();

    @NotNull
    UniTypographyToken getCompactControl500Medium();

    @NotNull
    UniTypographyToken getCompactNumeric400Small();

    @NotNull
    UniTypographyToken getCompactNumeric600Large();

    @NotNull
    UniTypographyToken getHeadline300XSmall();

    @NotNull
    UniTypographyToken getHeadline400Small();

    @NotNull
    UniTypographyToken getHeadline500Medium();

    @NotNull
    UniTypographyToken getHeadline500XMedium();

    @NotNull
    UniTypographyToken getHeadline550Medium();

    @NotNull
    UniTypographyToken getHeadline600Large();

    @NotNull
    UniTypographyToken getHeadline600Medium();

    @NotNull
    UniTypographyToken getHeadline700XLarge();

    @NotNull
    UniTypographyToken getHeadline800XxLarge();

    @NotNull
    UniTypographyToken getHeadline900XxLarge();

    @NotNull
    UniTypographyToken getHeadlineCompact400Medium();

    @NotNull
    UniTypographyToken getHeadlineCompact400Small();

    @NotNull
    UniTypographyToken getHeadlineNumeric700XLarge();

    @NotNull
    UniTypographyToken getHeadlineNumeric800XxLarge();

    @NotNull
    UniTypographyToken getHeadlinePromo400Small();

    @NotNull
    UniTypographyToken getHeadlinePromo500Medium();

    @NotNull
    UniTypographyToken getKeyPromo200XSmall();

    @NotNull
    UniTypographyToken getKeyPromo400Large();

    @NotNull
    UniTypographyToken getKeyPromo400Medium();

    @NotNull
    UniTypographyToken getKeyPromo500Medium();

    @NotNull
    UniTypographyToken getKeyPromo600Large();

    @NotNull
    UniTypographyToken getKeyPromo600XLarge();

    @NotNull
    UniTypographyToken getKeyPromo650Large();

    @NotNull
    UniTypographyToken getKeyPromo700Large();

    @NotNull
    UniTypographyToken getKeyPromo700XLarge();

    @NotNull
    UniTypographyToken getKeyPromo800Large();

    @NotNull
    UniTypographyToken getKeyPromo800Small();

    @NotNull
    UniTypographyToken getKeyPromo900Medium();
}
