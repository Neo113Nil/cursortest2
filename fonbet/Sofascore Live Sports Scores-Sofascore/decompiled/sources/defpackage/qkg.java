package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum qkg {
    d("XML_PARSING_ERROR", "A malformed or invalid XML document is retrieved from an AdCall.", 100001),
    e("VAST_VALIDATION_ERROR_MISSING_VERSION", "The “version” attribute is missing in the VAST response.", 101001),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("VAST_VALIDATION_ERROR_MISSING_IMPRESSION", "The <Impression> tag is missing in the VAST response.", 101004),
    f("VAST_VALIDATION_ERROR_MISSING_INLINE_AND_WRAPPER", "The <Inline> and <Wrapper> tags are missing in the VAST response.", 101005),
    g("VAST_VALIDATION_ERROR_MISSING_CREATIVES", "The <Creatives> or <Creative> tags are missing or malformed in the VAST response.", 101007),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("VAST_VALIDATION_ERROR_NONLINEAR_MISSING_ATTRIBUTES", "Some NonLinear creative attributes are missing in the VAST response.", 101501),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("VAST_VALIDATION_ERROR_NONLINEAR_MISSING_RESOURCE", "The <StaticResource> tag of a NonLinear creative is missing or empty in the VAST response.", 101502),
    h("VAST_VERSION_ERROR_NOT_SUPPORTED", "The version attribute of a VAST file is not supported.", 102001),
    i("VAST_VERSION_ERROR_NOT_SUPPORTED_WRAPPER", "The version attribute of a resolved wrapper is not supported.", 102002),
    j("VAST_CREATIVE_ERROR_MISMATCHED_AD_LINEARITY", "Occurs when the client-side component receive a NonLinear creative when expecting a Linear.", 201001),
    k("VAST_WRAPPER_ERROR", "Fatal error during wrapper resolution.", 300001),
    l("VAST_WRAPPER_ERROR_FETCH", "The resolution of a wrapper URI failed because of a HTTP error (40x, 50x).", 301001),
    m("VAST_WRAPPER_ERROR_FETCH_TIMEOUT", "The resolution of a wrapper URI fails because of timeout.", 301003),
    n("VAST_VALIDATION_ERROR_MISSING_VASTADTAGURI", "The <VASTAdTagURI> tag is missing in the VAST response.", 101006),
    o("VAST_WRAPPER_ERROR_LIMIT_REACHED", "The maximum number of wrapper resolution defined by the configuration has been reached.", 302001),
    p("VAST_WRAPPER_ERROR_NOT_VAST_RESPONSE", "No ads VAST response after one or more Wrappers. Also includes number of empty VAST responses from fallback.", 303001),
    q("XML_PARSING_ERROR_WRAPPER", "A malformed or invalid XML document is retrieved from a wrapper resolution.", 100002),
    r("VAST_LINEAR_ERROR_GENERAL", "General Linear Error. Media player is unable to display the Linear Ad.", 400001),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("VAST_LINEAR_ERROR_MEDIA_UNABLE_TO_LOAD", "The client-side component was unable to load the Linear ad mediafiles.", 401001),
    s("VAST_VALIDATION_ERROR_LINEAR_MISSING_MEDIAFILES", "The <MediaFiles> tag of a Linear creative is missing or does not contain any valid <MediaFile> in the VAST response.", 101402),
    t("VAST_LINEAR_ERROR_MEDIA_FETCH_TIMEOUT", "The client-side component was unable to load the Linear selected mediafile because of a timeout.", 402001),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("VAST_LINEAR_ERROR_MEDIA_NO_VALID_FORMAT", "No suitable media files were found for the media player.", 403001),
    u("VAST_UNDEFINED_ERROR", "Undefined VAST error.", 900001),
    v("VAST_VALIDATION_ERROR_MISSING_ADSYSTEM", "The <AdSystem> tag is missing in the VAST response.", 101002),
    w("VAST_VALIDATION_ERROR_MISSING_ADTITLE", "The <AdTitle> tag is missing in the VAST response.", 101003),
    x("VAST_VALIDATION_ERROR_LINEAR_MISSING_DURATION", "The <Duration> tag of a linear creative is missing or empty in the VAST response.", 101401),
    /* JADX INFO: Fake field, exist only in values array */
    EF465("SMART_VAST_ERROR_ADCALL_FETCH", "HTTP error code returned when fetching first VAST (40x, 50x).", 10000001),
    /* JADX INFO: Fake field, exist only in values array */
    EF481("SMART_VAST_ERROR_ADCALL_FETCH_TIMEOUT", "Timeout when performing the first VAST Ad Call.", 10000002),
    /* JADX INFO: Fake field, exist only in values array */
    EF497("SMART_VAST_ERROR_TOTAL_TIMEOUT", "Total timeout reached before any wrapper resolution led to an InlineAd.", 10000101),
    /* JADX INFO: Fake field, exist only in values array */
    EF513("SMART_VAST_ERROR_UNIVERSAL_AD_ID_REJECTED", "Ad rejected client-side because of missing UniversalAdId or a creative with the same id was played already in the same ad break.", 10000301),
    /* JADX INFO: Fake field, exist only in values array */
    EF529("SMART_VAST_ERROR_VPAID_WRAPPER_FAILED_TO_LOAD", "Cannot load VPAID WRAPPER player.", 10000401);

    public final int a;
    public final int b;
    public final String c;

    qkg(String str, String str2, int i2) {
        this.a = r2;
        this.b = i2;
        this.c = str2;
    }
}
