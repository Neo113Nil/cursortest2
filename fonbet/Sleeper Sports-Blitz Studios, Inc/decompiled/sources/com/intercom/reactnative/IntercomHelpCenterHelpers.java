package com.intercom.reactnative;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.intercom.android.sdk.helpcenter.api.HelpCenterArticleSearchResult;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import java.util.List;

/* loaded from: classes8.dex */
public class IntercomHelpCenterHelpers {
    public static WritableArray parseArticlesToReadableArray(List<HelpCenterArticle> list) {
        WritableArray createArray = Arguments.createArray();
        for (HelpCenterArticle helpCenterArticle : (HelpCenterArticle[]) list.toArray(new HelpCenterArticle[list.size()])) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("id", helpCenterArticle.getArticleId());
            createMap.putString("title", helpCenterArticle.getTitle());
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    public static WritableArray parseHelpCenterArticleSearchToReadableArray(List<HelpCenterArticleSearchResult> list) {
        WritableArray createArray = Arguments.createArray();
        for (HelpCenterArticleSearchResult helpCenterArticleSearchResult : (HelpCenterArticleSearchResult[]) list.toArray(new HelpCenterArticleSearchResult[list.size()])) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("id", helpCenterArticleSearchResult.getArticleId());
            createMap.putString("title", helpCenterArticleSearchResult.getTitle());
            createMap.putString("matchingSnippet", helpCenterArticleSearchResult.getMatchingSnippet());
            createMap.putString("summary", helpCenterArticleSearchResult.getSummary());
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    public static WritableMap parseHelpCenterCollectionsContentToReadableMap(HelpCenterCollectionContent helpCenterCollectionContent) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("id", helpCenterCollectionContent.getCollectionId());
        createMap.putString("title", helpCenterCollectionContent.getTitle());
        createMap.putString("summary", helpCenterCollectionContent.getSummary());
        createMap.putArray("articles", parseArticlesToReadableArray(helpCenterCollectionContent.getHelpCenterArticles()));
        createMap.putArray("collections", parseHelpCenterCollectionsToReadableArray(helpCenterCollectionContent.getSubCollections()));
        return createMap;
    }

    public static WritableArray parseHelpCenterCollectionsToReadableArray(List<HelpCenterCollection> list) {
        HelpCenterCollection[] helpCenterCollectionArr = (HelpCenterCollection[]) list.toArray(new HelpCenterCollection[list.size()]);
        WritableArray createArray = Arguments.createArray();
        for (HelpCenterCollection helpCenterCollection : helpCenterCollectionArr) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("id", helpCenterCollection.getId());
            createMap.putString("title", helpCenterCollection.getTitle());
            createMap.putString("summary", helpCenterCollection.getSummary());
            createArray.pushMap(createMap);
        }
        return createArray;
    }
}
