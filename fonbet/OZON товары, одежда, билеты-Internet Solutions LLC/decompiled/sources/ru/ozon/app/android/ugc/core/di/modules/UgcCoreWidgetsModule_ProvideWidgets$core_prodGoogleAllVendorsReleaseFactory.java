package ru.ozon.app.android.ugc.core.di.modules;

import Jb.e;
import Jb.j;
import hi.InterfaceC6958a;
import java.util.Set;
import l20.c;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewMapper;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentInputV3NoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsHeaderV3NoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsListHeaderV3ViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsListV3Config;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsListV3ViewMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.core.CommentsScrollNoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.listreviews.core.ListReviewsConfig;
import ru.ozon.app.android.ugc.core.widgets.listreviews.core.more.ListReviewsMoreViewMapper;
import ru.ozon.app.android.ugc.core.widgets.listreviews.core.sorts.ListReviewsSortsViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormButtonViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormConfig;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core.ReportAbuseFormViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.core.ReviewGalleryFeedConfig;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.core.ReviewGalleryFeedRoundedBottomViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.core.ReviewGalleryFeedViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.core.ReviewGalleryPreviewConfig;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.core.ReviewGalleryPreviewViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryV2Config;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryV2NoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.core.ReviewGalleryViewMapper;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionConfig;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.SelectionItemDescriptionTextViewMapper;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle.SelectionItemDescriptionTitleViewMapper;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.noui.SelectionItemDescriptionNoUiViewMapper;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.socialHeader.SelectionItemDescriptionSocialHeaderViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.SingleReviewConfig;
import ru.ozon.app.android.ugc.core.widgets.tilesReviewsList.core.TilesReviewsListConfig;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;

/* loaded from: classes7.dex */
public final class UgcCoreWidgetsModule_ProvideWidgets$core_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$core_prodGoogleAllVendorsRelease(UgcCoreWidgetsModule ugcCoreWidgetsModule, ViewMapper2<? extends InterfaceC6958a, ?, ? extends c>[] viewMapper2Arr, SingleReviewConfig singleReviewConfig, ListReviewsConfig listReviewsConfig, ListReviewsSortsViewMapper listReviewsSortsViewMapper, ListReviewsMoreViewMapper listReviewsMoreViewMapper, CommentsListV3Config commentsListV3Config, CommentsListV3ViewMapper commentsListV3ViewMapper, CommentInputV3NoUiViewMapper commentInputV3NoUiViewMapper, CommentsHeaderV3NoUiViewMapper commentsHeaderV3NoUiViewMapper, CommentsListHeaderV3ViewMapper commentsListHeaderV3ViewMapper, CommentsScrollNoUiViewMapper commentsScrollNoUiViewMapper, ReportAbuseFormConfig reportAbuseFormConfig, ReportAbuseFormViewMapper reportAbuseFormViewMapper, ReportAbuseFormButtonViewMapper reportAbuseFormButtonViewMapper, ReviewGalleryViewMapper reviewGalleryViewMapper, ReviewGalleryV2NoUiViewMapper reviewGalleryV2NoUiViewMapper, ReviewGalleryV2Config reviewGalleryV2Config, ReviewGalleryFeedConfig reviewGalleryFeedConfig, ReviewGalleryFeedViewMapper reviewGalleryFeedViewMapper, ReviewGalleryFeedRoundedBottomViewMapper reviewGalleryFeedRoundedBottomViewMapper, ReviewGalleryPreviewConfig reviewGalleryPreviewConfig, ReviewGalleryPreviewViewMapper reviewGalleryPreviewViewMapper, TilesReviewsListConfig tilesReviewsListConfig, SkuThinScrollViewMapper skuThinScrollViewMapper, SelectionItemDescriptionConfig selectionItemDescriptionConfig, SelectionItemDescriptionTitleViewMapper selectionItemDescriptionTitleViewMapper, SelectionItemDescriptionTextViewMapper selectionItemDescriptionTextViewMapper, SelectionItemDescriptionSocialHeaderViewMapper selectionItemDescriptionSocialHeaderViewMapper, SelectionItemDescriptionNoUiViewMapper selectionItemDescriptionNoUiViewMapper, PlainTextViewMapper2 plainTextViewMapper2, SeparatorViewMapper separatorViewMapper) {
        Set<Widget2> provideWidgets$core_prodGoogleAllVendorsRelease = ugcCoreWidgetsModule.provideWidgets$core_prodGoogleAllVendorsRelease(viewMapper2Arr, singleReviewConfig, listReviewsConfig, listReviewsSortsViewMapper, listReviewsMoreViewMapper, commentsListV3Config, commentsListV3ViewMapper, commentInputV3NoUiViewMapper, commentsHeaderV3NoUiViewMapper, commentsListHeaderV3ViewMapper, commentsScrollNoUiViewMapper, reportAbuseFormConfig, reportAbuseFormViewMapper, reportAbuseFormButtonViewMapper, reviewGalleryViewMapper, reviewGalleryV2NoUiViewMapper, reviewGalleryV2Config, reviewGalleryFeedConfig, reviewGalleryFeedViewMapper, reviewGalleryFeedRoundedBottomViewMapper, reviewGalleryPreviewConfig, reviewGalleryPreviewViewMapper, tilesReviewsListConfig, skuThinScrollViewMapper, selectionItemDescriptionConfig, selectionItemDescriptionTitleViewMapper, selectionItemDescriptionTextViewMapper, selectionItemDescriptionSocialHeaderViewMapper, selectionItemDescriptionNoUiViewMapper, plainTextViewMapper2, separatorViewMapper);
        j.d(provideWidgets$core_prodGoogleAllVendorsRelease);
        return provideWidgets$core_prodGoogleAllVendorsRelease;
    }
}
